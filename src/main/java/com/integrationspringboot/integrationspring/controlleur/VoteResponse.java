package com.integrationspringboot.integrationspring.controlleur;
public class VoteResponse {
    private String voterId;
    private String candidateIdVotedFor;
    private String message;

    public VoteResponse(String voterId, String candidateIdVotedFor, String message) {
        this.voterId = voterId;
        this.candidateIdVotedFor = candidateIdVotedFor;
        this.message = message;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getCandidateIdVotedFor() {
        return candidateIdVotedFor;
    }

    public void setCandidateIdVotedFor(String candidateIdVotedFor) {
        this.candidateIdVotedFor = candidateIdVotedFor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
