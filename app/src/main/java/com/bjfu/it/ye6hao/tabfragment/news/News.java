package com.bjfu.it.ye6hao.tabfragment.news;

public class News {
    private String title;
    private String description;

    public static final News[] newses = {
        new News("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
        new News("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
        new News("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
        new News("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    //Each Workout has a name and description
    private News(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title;
    }
}
