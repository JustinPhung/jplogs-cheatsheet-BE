package com.example.jplogsBE.Diary;

import javax.persistence.*;

@Entity
public class DiaryJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long oid;
    private String uuid;
    @Lob
    private String diaryEntry;
    private String time;
    private String externalUrl;

    @java.beans.ConstructorProperties({"uuid", "diaryEntry", "time", "externalUrl"})
    public DiaryJpa(String uuid, String diaryEntry, String time, String externalUrl) {
        this.uuid = uuid;
        this.diaryEntry = diaryEntry;
        this.time = time;
        this.externalUrl = externalUrl;
    }

    public DiaryJpa(){

    }

    public long getOid() {
        return this.oid;
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

    public void setOid(long oid) {
        this.oid = oid;
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
        if (!(o instanceof DiaryJpa)) return false;
        final DiaryJpa other = (DiaryJpa) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getOid() != other.getOid()) return false;
        final Object this$uuid = this.getUuid();
        final Object other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) return false;
        final Object this$diaryEntry = this.getDiaryEntry();
        final Object other$diaryEntry = other.getDiaryEntry();
        if (this$diaryEntry == null ? other$diaryEntry != null : !this$diaryEntry.equals(other$diaryEntry))
            return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        final Object this$externalUrl = this.getExternalUrl();
        final Object other$externalUrl = other.getExternalUrl();
        if (this$externalUrl == null ? other$externalUrl != null : !this$externalUrl.equals(other$externalUrl))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $oid = this.getOid();
        result = result * PRIME + (int) ($oid >>> 32 ^ $oid);
        final Object $uuid = this.getUuid();
        result = result * PRIME + ($uuid == null ? 43 : $uuid.hashCode());
        final Object $diaryEntry = this.getDiaryEntry();
        result = result * PRIME + ($diaryEntry == null ? 43 : $diaryEntry.hashCode());
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        final Object $externalUrl = this.getExternalUrl();
        result = result * PRIME + ($externalUrl == null ? 43 : $externalUrl.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DiaryJpa;
    }

    public String toString() {
        return "DiaryJpa(oid=" + this.getOid() + ", uuid=" + this.getUuid() + ", diaryEntry=" + this.getDiaryEntry() + ", time=" + this.getTime() + ", externalUrl=" + this.getExternalUrl() + ")";
    }
}
