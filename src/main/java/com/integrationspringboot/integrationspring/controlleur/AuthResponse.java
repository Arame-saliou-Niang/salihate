package com.integrationspringboot.integrationspring.controlleur;

public class AuthResponse {
    private String id_token;
    private String voterId;
    private String message;

    public AuthResponse(String idToken, String voterId, String message) {
        this.id_token = idToken;
        this.voterId = voterId;
        this.message = message;
    }

    public String getId_token() {
        return id_token;
    }

    public String getVoterId() {
        return voterId;
    }

    public String getMessage() {
        return message;
    }
}

