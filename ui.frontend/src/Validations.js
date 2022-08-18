export default {
  fullname: /^[A-Z]{1}[a-z]+( [a-zA-Z'"-]+)+$/,
  nickname: /^\w+$/,
  email: /^[^@\t\n\r ]+@[^@\t\n\r ]+\.[^@\t\n\r ]+$/,
  phone: /^\d{11}$/,
  birthday: /^\d{4}-\d{2}-\d{2}$/,
  linkedin: /^(https:\/\/)*(linkedin.com\/in\/){1}\w{5,}$/,
  github: /^(https:\/\/)*(github.com\/){1}\w{4,}$/,
  certificate: /^(https:\/\/)*(www)*\d*\.*\w+\.\w+\/\w+$/,
  teamname: /^(https:\/\/)*(linkedin.com\/in\/){1}\w{5,}$/,
  graduation: /^\w+\s*\w*$/,
  institution: /^\w+\s*\w*$/
}
