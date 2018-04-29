package com.example.jplogsBE.ToDo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long oid;
    private String uuid;
    private String name;
    private String time;
    private int priority;

    @java.beans.ConstructorProperties({"uuid", "name", "time", "priority"})
    public ToDoJpa(String uuid, String name, String time, int priority) {
        this.uuid = uuid;
        this.name = name;
        this.time = time;
        this.priority = priority;
    }

    public ToDoJpa(){

    }

    public String getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getTime() {
        return this.time;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ToDoJpa)) return false;
        final ToDoJpa other = (ToDoJpa) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uuid = this.getUuid();
        final Object other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        if (this.getPriority() != other.getPriority()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uuid = this.getUuid();
        result = result * PRIME + ($uuid == null ? 43 : $uuid.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        result = result * PRIME + this.getPriority();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ToDoJpa;
    }

    public String toString() {
        return "ToDoJpa(uuid=" + this.getUuid() + ", name=" + this.getName() + ", time=" + this.getTime() + ", priority=" + this.getPriority() + ")";
    }
}
