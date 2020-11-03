package com.demo.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo.pojo
 * @date 2020/10/29 20:42
 */
@Data
@Table(name="task")
public class Task {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "taskName")
    private String taskName;
    @Column(name = "taskType")
    private String taskType;
    @Column(name = "projectId")
    private Integer projectId;
    @Column(name = "startTime")
    private Date startTime;
    @Column(name = "planEndTime")
    private Date planEndTime;
    @Column(name = "realEndTime")
    private Date realEndTime;
    @Column(name = "taskDescription")
    private String taskDescription;
    @Column(name = "status")
    private Integer status;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "createTime")
    private Date createTime;
}
