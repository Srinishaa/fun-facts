package com.jpmc.funfacts;

public class Facts {
    private String[] facts = new String[]{"I love to sing", "I have Lepidopterophobia. Lepidopterophobia is the fear of butterflies or moths.",
            "I prefer being called Nisha", "I love travelling", "I love coding", "I enjoy reading fiction books"};
    private String fact;
    private int id;

    public Facts() {
    	this.id = (int)(Math.random()*6);
        this.fact = facts[id];
    }

    public String getFact() {
		return fact;
	}

	public int getId() {
		return this.id;
	}
	
}
