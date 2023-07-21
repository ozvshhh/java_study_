class ProgressHelper{
    int turn = 0;
    void isEnd(int player_hp,int enemy_hp) {
        if (player_hp == 0) {
            System.out.println("플레이어 승");
        }
        else{
            System.out.println("사망하셨습니다.");

        }
    }
}