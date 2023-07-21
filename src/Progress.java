class Progress{
    void printStartLog (){
        String [] scripts = {
                "당신은 트위스티드 페이트 입니다.",
                "목숨을 건 도박에서 승리하십시오",
                "규칙은 간단합니다.",
                "3개의 주사위를 굴리십시오",
                "주사위의 합만큼의 데미지를 적에게 줄 수 있습니다.",
                "적도 당신을 공격할 때에 주사위를 이용합니다.",
                "걱정하시마세요 당신의 주사위는 사기주사위이기 때문에 쉽게 이길 수 있을 겁니다.",
                "주사위에는 몇가지 마법이 걸려있으니 주의하세요"
        };
        for(int i=0; i < scripts.length; i++){
            System.out.println(scripts[i]); // 스크립트 재생하기
            try {
                Thread.sleep(100*scripts[i].length()); //문장의 길이만큼 딜레이주기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    void printEndLog(){
        System.out.println("사망");

        System.out.println("살아남았습니다.");

    }
}
