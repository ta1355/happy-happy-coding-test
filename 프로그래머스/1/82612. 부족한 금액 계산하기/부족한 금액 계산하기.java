  class Solution {
            public long solution(int price, int money, int count) {
                int h =0;
                long pricecount =0;
                h = price;
                long answer = 0;
                for (int i = 0; i < count; i++) {
                    pricecount += price;
                    price = price + h;

                }

                answer = pricecount - money;

                if (answer >0) {
                    return answer;
                }else {
                    return answer = 0;
                }
            }
        }