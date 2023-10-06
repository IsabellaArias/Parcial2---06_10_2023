package Enum;

public enum VideoGames {
    DEPORTIVOS("FIFA 22","FIFA 22 is a football simulation game developed by EA Sports. Players can experience realistic football matches, create and manage teams, and participate in various leagues and tournaments.",2021){
        public void showPositionRanking(){
            System.out.println("The classification system will be based on multiple criteria, including user performance in assigned activities, participation in challenges and events, as well as consistency and continuous improvement in meeting established objectives. Users will be evaluated periodically and will receive points or ranks that reflect their progress.");
        }
        public void buyCoins(){
            System.out.println("Users will be able to earn coins in the system through various actions and achievements within the platform. Coins will be awarded as a reward for completing assigned tasks, actively participating in events and challenges, as well as contributing significantly to the community, such as posting useful content, providing valuable answers, and collaborating on projects.");
        }
    }, ESTRATEGIA("Civilization VI","Civilization VI is a turn-based strategy game that lets you build and expand your own civilization. You must make strategic decisions about diplomacy, science, culture, and the military to take your civilization from ancient times to the modern era.",2016){
    public void showPositionRanking(){
        System.out.println("The classification system will be based on multiple criteria, including user performance in assigned activities, participation in challenges and events, as well as consistency and continuous improvement in meeting established objectives. Users will be evaluated periodically and will receive points or ranks that reflect their progress.");
    }
    public void buyCoins(){
        System.out.println("Users will be able to earn coins in the system through various actions and achievements within the platform. Coins will be awarded as a reward for completing assigned tasks, actively participating in events and challenges, as well as contributing significantly to the community, such as posting useful content, providing valuable answers, and collaborating on projects.");
    }
    },MUSICALES("Guitar Hero III: Legends of Rock","Guitar Hero III is a musical game in which players play famous songs using a plastic guitar. You have to press the correct buttons and synchronize your movements with the music to get the highest score.",2007){
    public void showPositionRanking(){
        System.out.println("The classification system will be based on multiple criteria, including user performance in assigned activities, participation in challenges and events, as well as consistency and continuous improvement in meeting established objectives. Users will be evaluated periodically and will receive points or ranks that reflect their progress.");
    }
    public void buyCoins(){
        System.out.println("Users will be able to earn coins in the system through various actions and achievements within the platform. Coins will be awarded as a reward for completing assigned tasks, actively participating in events and challenges, as well as contributing significantly to the community, such as posting useful content, providing valuable answers, and collaborating on projects.");
    }
    }, AVENTURA("The Legend of Zelda: Breath of the Wild","Breath of the Wild is an open world adventure game where players explore the kingdom of Hyrule. You can solve puzzles, fight enemies and uncover secrets as you embark on a mission to defeat the evil Calamity Ganon.",2017){
    public void showPositionRanking(){
        System.out.println("The classification system will be based on multiple criteria, including user performance in assigned activities, participation in challenges and events, as well as consistency and continuous improvement in meeting established objectives. Users will be evaluated periodically and will receive points or ranks that reflect their progress.");
    }
    public void buyCoins(){
        System.out.println("Users will be able to earn coins in the system through various actions and achievements within the platform. Coins will be awarded as a reward for completing assigned tasks, actively participating in events and challenges, as well as contributing significantly to the community, such as posting useful content, providing valuable answers, and collaborating on projects.");
    }
    },SIMULACION("The Sims 4","The Sims 4 is a life simulation game in which you can create and control virtual people, called Sims. You can build houses, meet their basic needs, build relationships, advance careers, and explore different aspects of everyday life.",2014){
    public void showPositionRanking(){
        System.out.println("The classification system will be based on multiple criteria, including user performance in assigned activities, participation in challenges and events, as well as consistency and continuous improvement in meeting established objectives. Users will be evaluated periodically and will receive points or ranks that reflect their progress.");
    }
    public void buyCoins(){
        System.out.println("Users will be able to earn coins in the system through various actions and achievements within the platform. Coins will be awarded as a reward for completing assigned tasks, actively participating in events and challenges, as well as contributing significantly to the community, such as posting useful content, providing valuable answers, and collaborating on projects.");
    }
};
    private String nameVideoGame;
    private String howDoYouPlay;
    private Integer yearOfCreation;

    VideoGames(String nameVideoGame, String howDoYouPlay, Integer yearOfCreation) {
        this.nameVideoGame = nameVideoGame;
        this.howDoYouPlay = howDoYouPlay;
        this.yearOfCreation = yearOfCreation;
    }

    public abstract void showPositionRanking();
    public abstract void buyCoins();

    public String getNameVideoGame() {
        return nameVideoGame;
    }

    public void setNameVideoGame(String nameVideoGame) {
        this.nameVideoGame = nameVideoGame;
    }

    public String getHowDoYouPlay() {
        return howDoYouPlay;
    }

    public void setHowDoYouPlay(String howDoYouPlay) {
        this.howDoYouPlay = howDoYouPlay;
    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(Integer yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public void Servicio() {
        System.out.println("Name Video Game: " + nameVideoGame);
        System.out.println("How Do You Play: " + howDoYouPlay);
        System.out.println("Year Of Creation: $" + yearOfCreation);
    }
}
