package com.somethinglikethat.campustore.model;

import javax.persistence.*;
import java.util.Date;
@Table(name = "app")
@Entity
public class App {
    @Id
    @GeneratedValue
    @Column(name = "app_no")
    private Long app_no;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "uploader_no", referencedColumnName = "user_no", nullable=false)
    private User uploader_no;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "version", length = 20, nullable = false)
    private String version;

    @Column(name = "volume", nullable = false)
    private Integer volume;


    @Column(name = "storage", length = 256, nullable = false)
    private String storage;

    @Column(name = "view_count")
    private Integer viewCount;

    @Column(name = "download_count")
    private Integer downloadCount;

    @Column(name = "stared")
    private Integer stared;

    @Column(name = "fund_goal", nullable = false)
    private Integer fundGoalAmount;

    @Column(name = "fund_amount")
    private Integer fundedAmount;

    @Column(name = "register_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @Column(name = "update_date")
    private Date updateDate;
}
