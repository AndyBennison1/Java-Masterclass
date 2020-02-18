public class Warrior {

    public String Name;
    public int experience;
    public int level = experience/100;
    public String rank;
    public String[] Achievements;

    public Warrior() {
    }

    public Warrior(String Name) {
        this.Name = Name;
    }

    public void rank(String Name) {
        this.Name = Name;
        System.out.println("Test");
        String[] ranksArray = {"Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"};
        this.rank = ranksArray[Math.round(experience / 100)];
    }

    public String battle(int opponentLevel, int opponentExp) {
        String result;
        int diff = (this.experience - opponentExp);
            if (this.level == opponentLevel) {
                result = "A good fight";
            } else if (this.level - opponentLevel == 1) {
                result = "A good fight";
                this.experience += 10;
            } else if ((this.level - opponentLevel) >= 2) {
                result = "Easy fight";
                this.experience += 0;
            } else if ((this.level - opponentLevel) == -1) {
                result = "An intense fight";
                this.experience += (20 * diff * diff);
            } else {
                result = "unable to fight";
            }
        if (this.experience >= 10000){
            this.experience = 10000;
        }
        return result;
    }


}

/*
    public String rank(String name) {
        this.Name = name;
        if (this.level > 0 && this.level < 10) {
            this.rank = "Pushover";
}       else if (this.level > 10 && this.level < 20) {
            this.rank = "Novice";
        } else if (this.level > 20 && this.level < 30) {
            this.rank = "Fighter";
        } else if (this.level > 30 && this.level < 40) {
            this.rank = "Warrior";
        } else if (this.level > 40 && this.level < 50) {
            this.rank = "Veteran";
        } else if (this.level > 50 && this.level < 60) {
            this.rank = "Sage";
        } else if (this.level > 60 && this.level < 70) {
            this.rank = "Elite";
        } else if (this.level > 70 && this.level < 80) {
            this.rank = "Conqueror";
        } else if (this.level > 80 && this.level < 90) {
            this.rank = "Champion";
        } else if (this.level > 90 && this.level < 100) {
            this.rank = "Master";
        } else if (this.level == 100) {
            this.rank = "Greatest";
        } else {
            this.rank = "No Valid Rank";
        }
return this.rank;
    }*/

