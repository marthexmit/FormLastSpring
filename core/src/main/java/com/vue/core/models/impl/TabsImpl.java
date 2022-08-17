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
    private String InputStyle;
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
    @JsonProperty("InputStyle")
    public String getInputStyle() {
        return InputStyle;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
