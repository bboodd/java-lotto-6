package lotto.view;

import java.util.List;

public class OutputView {
    private static final String MONEY_INPUT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String MONEY_INPUT_RESULT_MESSAGE = "%d개를 구매했습니다. \n";
    private static final String LOTTO_INPUT_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_INPUT_MESSAGE = "보너스 번호를 입력해 주세요.";

    public void println(String message){
        System.out.println(message);
    }

    public void println(){
        System.out.println();
    }

    public void bonusInputMessage(){
        println();
        println(BONUS_INPUT_MESSAGE);
    }

    public void lottoInputMessage(){
        println(LOTTO_INPUT_MESSAGE);
    }

    public void moneyInputMessage(){
        println(MONEY_INPUT_MESSAGE);
    }

    public void moneyInputResultMessage(int money){
        println();
        System.out.printf(MONEY_INPUT_RESULT_MESSAGE, money);
    }

    public void printLottoTickets(List<List<Integer>> lottoTickets){
        for(List<Integer> lotto : lottoTickets){
            System.out.println(lotto);
        }
        println();
    }
}
