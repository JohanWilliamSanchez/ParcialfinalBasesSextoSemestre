/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Labing
 */
public class Exerc {
    private char cat;
    private int eno,maxpt;
    private String topic;

    public char getCat() {
        return cat;
    }

    public void setCat(char cat) {
        this.cat = cat;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getMaxpt() {
        return maxpt;
    }

    public void setMaxpt(int maxpt) {
        this.maxpt = maxpt;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Exerc() {
    }

    public Exerc(char cat, int eno, int maxpt, String topic) {
        this.cat = cat;
        this.eno = eno;
        this.maxpt = maxpt;
        this.topic = topic;
    }
}
