package com.jobApplication.JobApplication.model;

public class Applications {

    private long id;
    private String jobTitle;
    private String jobDescription;
    private String status;

    public Applications(long id, String jobTitle, String jobDescription,String status){
        this.id=id;
        this.jobTitle=jobTitle;
        this.jobDescription=jobDescription;
        this.status=status;

    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;

    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;

    }


    public String getJobDescription(){
        return jobDescription;
    }

    public void setJobDescription(String jobDescription){
        this.jobDescription=jobDescription;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }
}
