package com.config.server.currency_exchange_service.model;

import jakarta.persistence.*;

@Entity
@Table(name="currency_exchange")
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private double conversionMultiple;
    private String environmentDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironmentDetails() {
        return environmentDetails;
    }

    public void setEnvironmentDetails(String environmentDetails) {
        this.environmentDetails = environmentDetails;
    }

    public CurrencyExchange(Long id, String from, String to, double conversionMultiple, String environmentDetails) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.environmentDetails = environmentDetails;
    }

    public CurrencyExchange() {
    }
}

