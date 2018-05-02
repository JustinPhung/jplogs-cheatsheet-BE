package com.example.jplogsBE.Diary;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonDeserialize
public class DiaryDTO {
        private String uuid;
        private String diaryEntry;
        private String time;
        private String externalUrl;

    public DiaryDTO(String uuid, String diaryEntry, String time, String externalUrl) {
        this.uuid = uuid;
        this.diaryEntry = diaryEntry;
        this.time = time;
        this.externalUrl = externalUrl;
    }

    public DiaryDTO (){

    }

    public String getUuid() {
        return this.uuid;
    }

    public String getDiaryEntry() {
        return this.diaryEntry;
    }

    public String getTime() {
        return this.time;
    }

    public String getExternalUrl() {
        return this.externalUrl;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setDiaryEntry(String diaryEntry) {
        this.diaryEntry = diaryEntry;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DiaryDTO)) return false;
        final DiaryDTO other = (DiaryDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uuid = this.getUuid();
        final Object other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) return false;
        final Object this$name = this.getDiaryEntry();
        final Object other$name = other.getDiaryEntry();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        final Object this$priority = this.getExternalUrl();
        final Object other$priority = other.getExternalUrl();
        if (this$priority == null ? other$priority != null : !this$priority.equals(other$priority)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uuid = this.getUuid();
        result = result * PRIME + ($uuid == null ? 43 : $uuid.hashCode());
        final Object $name = this.getDiaryEntry();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        final Object $priority = this.getExternalUrl();
        result = result * PRIME + ($priority == null ? 43 : $priority.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DiaryDTO;
    }

    public String toString() {
        return "DiaryDTO(uuid=" + this.getUuid() + ", diaryEntry=" + this.getDiaryEntry() + ", time=" + this.getTime() + ", externalUrl=" + this.getExternalUrl() + ")";
    }
}
