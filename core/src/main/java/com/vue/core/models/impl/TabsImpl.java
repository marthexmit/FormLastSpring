/*
 * ***********************************************************************
 * SPA Vue Project CONFIDENTIAL
 * ___________________
 *
 * Copyright 2022 SPA Vue Project.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of SPA Vue Project and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to SPA Vue Project
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from SPA Vue Project.
 * ***********************************************************************
 */

package com.vue.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vue.core.models.Tabs;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    Tabs.class,
    ComponentExporter.class
}, resourceType = "vue/components/tabs")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class TabsImpl
    implements Tabs
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String FormTitle;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String FontType;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String FontColor;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long FontSize;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String FullNamePlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String FullNameLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String NicknamePlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String NicknameLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String EmailPlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String EmailLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String PhonePlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String PhoneLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String LinkedinPlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String LinkedinLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String GithubPlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String GithubLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String CertificatesPlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String CertificatesLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String TeamNamePlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String TeamNameLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String InstitutionPlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String InstitutionLabel;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String GraduationPlaceholder;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String GraduationLabel;
    @SlingObject
    private Resource resource;

    @Override
    @JsonProperty("FormTitle")
    public String getFormTitle() {
        return FormTitle;
    }

    @Override
    @JsonProperty("FontType")
    public String getFontType() {
        return FontType;
    }

    @Override
    @JsonProperty("FontColor")
    public String getFontColor() {
        return FontColor;
    }

    @Override
    @JsonProperty("FontSize")
    public Long getFontSize() {
        return FontSize;
    }

    @Override
    @JsonProperty("FullNamePlaceholder")
    public String getFullNamePlaceholder() {
        return FullNamePlaceholder;
    }

    @Override
    @JsonProperty("FullNameLabel")
    public String getFullNameLabel() {
        return FullNameLabel;
    }

    @Override
    @JsonProperty("NicknamePlaceholder")
    public String getNicknamePlaceholder() {
        return NicknamePlaceholder;
    }

    @Override
    @JsonProperty("NicknameLabel")
    public String getNicknameLabel() {
        return NicknameLabel;
    }

    @Override
    @JsonProperty("EmailPlaceholder")
    public String getEmailPlaceholder() {
        return EmailPlaceholder;
    }

    @Override
    @JsonProperty("EmailLabel")
    public String getEmailLabel() {
        return EmailLabel;
    }

    @Override
    @JsonProperty("PhonePlaceholder")
    public String getPhonePlaceholder() {
        return PhonePlaceholder;
    }

    @Override
    @JsonProperty("PhoneLabel")
    public String getPhoneLabel() {
        return PhoneLabel;
    }

    @Override
    @JsonProperty("LinkedinPlaceholder")
    public String getLinkedinPlaceholder() {
        return LinkedinPlaceholder;
    }

    @Override
    @JsonProperty("LinkedinLabel")
    public String getLinkedinLabel() {
        return LinkedinLabel;
    }

    @Override
    @JsonProperty("GithubPlaceholder")
    public String getGithubPlaceholder() {
        return GithubPlaceholder;
    }

    @Override
    @JsonProperty("GithubLabel")
    public String getGithubLabel() {
        return GithubLabel;
    }

    @Override
    @JsonProperty("CertificatesPlaceholder")
    public String getCertificatesPlaceholder() {
        return CertificatesPlaceholder;
    }

    @Override
    @JsonProperty("CertificatesLabel")
    public String getCertificatesLabel() {
        return CertificatesLabel;
    }

    @Override
    @JsonProperty("TeamNamePlaceholder")
    public String getTeamNamePlaceholder() {
        return TeamNamePlaceholder;
    }

    @Override
    @JsonProperty("TeamNameLabel")
    public String getTeamNameLabel() {
        return TeamNameLabel;
    }

    @Override
    @JsonProperty("InstitutionPlaceholder")
    public String getInstitutionPlaceholder() {
        return InstitutionPlaceholder;
    }

    @Override
    @JsonProperty("InstitutionLabel")
    public String getInstitutionLabel() {
        return InstitutionLabel;
    }

    @Override
    @JsonProperty("GraduationPlaceholder")
    public String getGraduationPlaceholder() {
        return GraduationPlaceholder;
    }

    @Override
    @JsonProperty("GraduationLabel")
    public String getGraduationLabel() {
        return GraduationLabel;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
