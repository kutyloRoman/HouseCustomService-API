package com.kutylo.lab_2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "custom")
public class Custom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "kind_of_work")
    private String kindOfWork;

    @Column(name = "scope")
    private String scope;

    @Column(name = "time_of_end")
    private String time;

    @Column(name="status")
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @OneToOne(mappedBy = "custom",fetch = FetchType.LAZY)
    private Plan plan;

    //----------------------------------------------------------------------------//
    public Custom() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKindOfWork() {
        return kindOfWork;
    }

    public void setKindOfWork(String kindOfWork) {
        this.kindOfWork = kindOfWork;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "id=" + id +
                ", kindOfWork='" + kindOfWork + '\'' +
                ", scope='" + scope + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                ", user=" + user +
                ", plan=" + plan +
                '}';
    }
}
