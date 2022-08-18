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

package com.vue.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code Tabs} Sling Model used for the {@code vue/components/tabs} component.
 * 
 */
@ConsumerType
public interface Tabs
    extends ComponentExporter
{


    @JsonProperty("FormTitle")
    String getFormTitle();

    @JsonProperty("FontType")
    String getFontType();

    @JsonProperty("FontColor")
    String getFontColor();

    @JsonProperty("FontSize")
    Long getFontSize();

    @JsonProperty("FullNamePlaceholder")
    String getFullNamePlaceholder();

    @JsonProperty("FullNameLabel")
    String getFullNameLabel();

    @JsonProperty("NicknamePlaceholder")
    String getNicknamePlaceholder();

    @JsonProperty("NicknameLabel")
    String getNicknameLabel();

    @JsonProperty("EmailPlaceholder")
    String getEmailPlaceholder();

    @JsonProperty("EmailLabel")
    String getEmailLabel();

    @JsonProperty("PhonePlaceholder")
    String getPhonePlaceholder();

    @JsonProperty("PhoneLabel")
    String getPhoneLabel();

    @JsonProperty("LinkedinPlaceholder")
    String getLinkedinPlaceholder();

    @JsonProperty("LinkedinLabel")
    String getLinkedinLabel();

    @JsonProperty("GithubPlaceholder")
    String getGithubPlaceholder();

    @JsonProperty("GithubLabel")
    String getGithubLabel();

    @JsonProperty("CertificatesPlaceholder")
    String getCertificatesPlaceholder();

    @JsonProperty("CertificatesLabel")
    String getCertificatesLabel();

    @JsonProperty("TeamNamePlaceholder")
    String getTeamNamePlaceholder();

    @JsonProperty("TeamNameLabel")
    String getTeamNameLabel();

    @JsonProperty("InstitutionPlaceholder")
    String getInstitutionPlaceholder();

    @JsonProperty("InstitutionLabel")
    String getInstitutionLabel();

    @JsonProperty("GraduationPlaceholder")
    String getGraduationPlaceholder();

    @JsonProperty("GraduationLabel")
    String getGraduationLabel();

}
