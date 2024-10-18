package 이유나;

import java.util.Scanner;

public class Store {
    private Scanner scan = new Scanner(System.in);
    private boolean running = true;
    private OrderDTO orderDTO = new OrderDTO();

    public void runStore() {
        while (running) {
            displayMenu();
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    selectPopcorn();
                    break;
                case 2:
                    System.out.println("나쵸를 선택하셨습니다.");
                    orderDTO.addOrder("나쵸");
                    break;
                case 3:
                    System.out.println("핫도그를 선택하셨습니다.");
                    orderDTO.addOrder("핫도그");
                    break;
                case 4:
                    selectDrink();
                    break;
                case 5:
                    displayOrder();
                    break;
                case 6:
                    completeOrder();
                    break;
                case 7:
                    System.out.println("[처음 옵션으로 이동]");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("====================");
        System.out.println("===     메뉴      ===");
        System.out.println("====================");
        System.out.println("1. 팝콘");
        System.out.println("2. 나쵸");
        System.out.println("3. 핫도그");
        System.out.println("4. 음료");
        System.out.println("5. 선택된 상품 조회");
        System.out.println("6. 구매하기");
        System.out.println("7. 뒤로가기");
        System.out.println("====================");
        System.out.println("원하는 메뉴를 선택하세요 : ");
        System.out.println("====================");
    }

    private void selectPopcorn() {
        System.out.println("팝콘의 맛을 선택해주세요.");
        System.out.println("1. 달콤");
        System.out.println("2. 오리지널");
        System.out.println("3. 어니언");
        System.out.println("4. 치즈");
        System.out.println("5. 갈릭");

        int popcorn = scan.nextInt();
        switch (popcorn) {
            case 1:
                orderDTO.addOrder("달콤한 맛");
                System.out.println("달콤한 맛을 선택하셨습니다.");
                break;
            case 2:
                orderDTO.addOrder("오리지널 맛");
                System.out.println("오리지널 맛을 선택하셨습니다.");
                break;
            case 3:
                orderDTO.addOrder("어니언 맛");
                System.out.println("어니언 맛을 선택하셨습니다.");
                break;
            case 4:
                orderDTO.addOrder("치즈 맛");
                System.out.println("치즈 맛을 선택하셨습니다.");
                break;
            case 5:
                orderDTO.addOrder("갈릭 맛");
                System.out.println("갈릭 맛을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    private void selectDrink() {
        System.out.println("음료를 선택하세요.");
        System.out.println("1. 콜라");
        System.out.println("2. 사이다");
        System.out.println("3. 아메리카노");
        System.out.println("4. 물");

        int drink = scan.nextInt();
        switch (drink) {
            case 1:
                orderDTO.addOrder("콜라");
                System.out.println("콜라를 선택하셨습니다.");
                break;
            case 2:
                orderDTO.addOrder("사이다");
                System.out.println("사이다를 선택하셨습니다.");
                break;
            case 3:
                orderDTO.addOrder("아메리카노");
                System.out.println("아메리카노를 선택하셨습니다.");
                break;
            case 4:
                orderDTO.addOrder("물");
                System.out.println("물을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    private void displayOrder() {
        if (orderDTO.isEmpty()) {
            System.out.println("-------------------");
            System.out.println("주문한 내용이 없습니다.");
            System.out.println("-------------------");
        } else {
            System.out.println("-------------------");
            System.out.println("선택한 주문 내용 : ");
            System.out.println("-------------------");
            for (String item : orderDTO.getOrderList()) {
                System.out.println("- " + item);
            }
        }
    }

    private void completeOrder() {
        System.out.println("주문을 완료하시겠습니까 ?");
        System.out.println("1. 예");
        System.out.println("2. 아니요");

        int finish = scan.nextInt();
        switch (finish) {
            case 1:
                System.out.println("구매가 완료되었습니다.");
                break;
            case 2:
                System.out.println("구매를 종료합니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }
}