<template>
    <div class="birthday-container">
        <div class="labelBirthday">
            <Label>{{ fieldProps.LabelContent }}</Label>
            <TextComponent text="Please enter your Age" className="mediumLowSize error" id="errorBirthday" />
        </div>
        <div class="datesBody">
            <div class="daySelect">
                <!-- <Label text="Day" className="defaultLabel phoneLabel" /> -->
                <Label>Day</Label>
                <select name="day" class="day" @change="valueDay">
                    <option disabled>Day</option>
                    <option style="display:none">01</option>
                    <option id="optionDay" v-for="day in 31" :key="day">
                        {{ padStart(day) }}
                    </option>
                </select>
            </div>
            <div class="monthSelect">
                <!-- <Label text="Month" className="defaultLabel phoneLabel" /> -->
                <Label>Month</Label>
                <select name="month" class="month" @change="valueMonth">
                    <option disabled>Month</option>
                    <option style="display:none">01</option>
                    <option id="optionMonth" v-for="month in 12" :key="month">
                        {{ padStart(month) }}
                    </option>
                </select>
            </div>
            <div class="yearSelect">
                <!-- <Label text="Year" className="defaultLabel phoneLabel" /> -->
                <Label>Year</Label>
                <select name="year" class="year" @change="valueYears">
                    <option disabled>Year</option>
                    <option style="display:none">1901</option>
                    <option id="optionYear" v-for="year in this.yearsR" :key="year">
                        {{ year + 1900 }}
                    </option>
                </select>
            </div>
            <div class="Age">
                <!-- <Label inputLabel="" className="defaultLabel dateLabel" text="Age" /> -->
                <Label>Age</Label>
                <div class="age">
                    <h1 id="ageId" class="resultAge" contentEditable=false data-ph="18">{{ age }}</h1>
                </div>
            </div>

        </div>
    </div>
</template>

<script>
import Label from '@/components/Micro/Label/Label.vue'
import TextComponent from '@/components/Micro/TextComponent/TextComponent.vue'
export default {
  // eslint-disable-next-line
  name: "Birthday",
  components: { Label, TextComponent },
  props: {
    fieldProps: {
      type: Object
    }
  },
  data () {
    return {
      day: '',
      month: '',
      year: '',
      age: '',
      yearsR: ''

    }
  },
  methods: {

    valueDay (e) {
      this.day = e.target.value
      console.log(e.target.value)
      localStorage.setItem('day', this.day)
    },
    valueMonth (e) {
      this.month = e.target.value
      console.log(e.target.value)
      localStorage.setItem('month', this.month)
    },
    valueYears (e) {
      this.year = e.target.value
      console.log(e.target.value)
      localStorage.setItem('year', this.year)

      const d = new Date()
      const actualYear = d.getFullYear()
      const actualMonth = d.getMonth() + 1
      const actualDay = d.getDate()

      let ageUser = actualYear - this.year

      if (
        actualMonth < this.month ||
                (actualMonth === this.month && actualDay < this.day)
      ) {
        ageUser--
      }

      this.age = ageUser
      localStorage.setItem('age', this.age)
    },

    padStart (birthday) {
      return String(birthday).padStart(2, '0')
    },
    vYear () {
      const birthday = new Date()
      this.yearsR = birthday.getFullYear() - 1900
    }
  },
  created () {
    this.vYear()
  }
}
</script>

<style lang="scss" scoped>
@import './Birthday.scss';
</style>
