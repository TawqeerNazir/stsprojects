package com.Management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    private String answerName;

    @OneToOne(mappedBy = "answer", cascade = CascadeType.ALL)
    private Question question;

    // Constructors
    public Answer() {
    }

    public Answer(String answerName) {
        this.answerName = answerName;
    }

    // Getters and Setters
    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    // toString method
    @Override
    public String toString() {
        return "Answer [answerId=" + answerId + ", answerName=" + answerName + "]";
    }
}


