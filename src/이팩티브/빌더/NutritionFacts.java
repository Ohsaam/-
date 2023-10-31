package 이팩티브.빌더;
public class NutritionFacts 
{

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    
    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }


    public static class Builder 
	{
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수 - 기본값으로 초기화한다.
        private int calories      = 0;
        private int fat           = 0;
        private int sodium        = 0;
        private int carbohydrate  = 0;

        public Builder(int servingSize, int servings) 
  		{
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(int val)
        { 	
  			calories = val;      
  			return this; 
  		}
        public Builder fat(int val)
        { 
  			fat = val;           
  			return this; 
  		}
        public Builder sodium(int val)
        { 
  			sodium = val;        
  			return this; 
  			/**
  			 * this는 현재 객체(빌더)를 가리키며
  			 * 빌더 메서드 체이닝을 허용한다.
  			 * 러 메서드 호출을 연결할 수 있다.
  			 */
  		}
        public Builder carbohydrate(int val)
        { 
  			carbohydrate = val;  
  			return this; 
  		}
        /**
         * this를 반환하여 메서드 체이닝을 지원
         * 최종적으로 build 메서드를 호출하여 
         * 불변 객체를 생성하는 것이 일반적
         * 
         */

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
        
    }



    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts
  					.Builder(240, 8)
  					.calories(100)
  					.sodium(35)
  					.carbohydrate(27)
  					.build();
    }
}