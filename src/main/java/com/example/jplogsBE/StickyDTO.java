package com.example.jplogsBE;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonDeserialize
public class StickyDTO {
    private String uuid;
    private String name;
    private String copyText;
    private String category;
    private Integer used;

    public StickyDTO(String uuid, String name, String copyText, String category, Integer used) {
        this.uuid = uuid;
        this.name = name;
        this.copyText = copyText;
        this.category = category;
        this.used = used;
    }

    public StickyDTO(){

    }

    public String getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getCopyText() {
        return this.copyText;
    }

    public String getCategory() {
        return this.category;
    }

    public Integer getUsed() {
        return this.used;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCopyText(String copyText) {
        this.copyText = copyText;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof StickyDTO)) return false;
        final StickyDTO other = (StickyDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uuid = this.getUuid();
        final Object other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$copyText = this.getCopyText();
        final Object other$copyText = other.getCopyText();
        if (this$copyText == null ? other$copyText != null : !this$copyText.equals(other$copyText)) return false;
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        if (this$category == null ? other$category != null : !this$category.equals(other$category)) return false;
        final Object this$used = this.getUsed();
        final Object other$used = other.getUsed();
        if (this$used == null ? other$used != null : !this$used.equals(other$used)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uuid = this.getUuid();
        result = result * PRIME + ($uuid == null ? 43 : $uuid.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $copyText = this.getCopyText();
        result = result * PRIME + ($copyText == null ? 43 : $copyText.hashCode());
        final Object $category = this.getCategory();
        result = result * PRIME + ($category == null ? 43 : $category.hashCode());
        final Object $used = this.getUsed();
        result = result * PRIME + ($used == null ? 43 : $used.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof StickyDTO;
    }

    public String toString() {
        return "StickyDTO(uuid=" + this.getUuid() + ", name=" + this.getName() + ", copyText=" + this.getCopyText() + ", category=" + this.getCategory() + ", used=" + this.getUsed() + ")";
    }
}
