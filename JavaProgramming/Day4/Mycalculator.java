interface calculator{
    Integer add(Integer n1,Integer n2);
    Integer sub(Integer n1,Integer n2);
    Integer mul(Integer n1,Integer n2);
    Integer div(Integer n1,Integer n2);
    Float add(Float n1,Float n2);
    Float sub(Float n1,Float n2);
    Float mul(Float n1,Float n2);
    Float div(Float n1,Float n2);
    Double add(Double n1,Double n2);
    Double sub(Double n1,Double n2);
    Double mul(Double n1,Double n2);
    Double div(Double n1,Double n2);
    Double add(Integer n1,Double n2);
    Double sub(Integer n1,Double n2);
    Double mul(Integer n1,Double n2);
    Double div(Integer n1,Double n2);
    Double add(Double n1,Integer n2);
    Double sub(Double n1,Integer n2);
    Double mul(Double n1,Integer n2);
    Double div(Double n1,Integer n2);
    Float add(Float n1,Integer n2);
    Float sub(Float n1,Integer n2);
    Float mul(Float n1,Integer n2);
    Float div(Float n1,Integer n2);
    Float add(Integer n1,Float n2);
    Float sub(Integer n1,Float n2);
    Float mul(Integer n1,Float n2);
    Float div(Integer n1,Float n2);
    Double add(Double n1,Float n2);
    Double sub(Double n1,Float n2);
    Double mul(Double n1,Float n2);
    Double div(Double n1,Float n2);
    Double add(Float n1,Double n2);
    Double sub(Float n1,Double n2);
    Double mul(Float n1,Double n2);
    Double div(Float n1,Double n2);
}

class Mycalculator implements calculator{
        public Integer add(Integer n1,Integer n2){
             return n1 + n2;
        }
        public Integer sub(Integer n1,Integer n2)
        {
            return n1 - n2;
        }
        public Integer mul(Integer n1,Integer n2){
            return n1*n2;
        }
        public Integer div(Integer n1,Integer n2)
        {
             Integer divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1;
            }
            return divison;
        }
        public Float add(Float n1,Float n2){
             return n1 + n2;
        }
        public Float sub(Float n1,Float n2)
        {
            return n1 - n2;
        }
        public Float mul(Float n1,Float n2){
            return n1*n2;
        }
        public Float div(Float n1,Float n2)
        {
             Float divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0f;
            }
            return divison;
        }
        public Double add(Double n1,Double n2){
             return n1 + n2;
        }
        public Double sub(Double n1,Double n2)
        {
            return n1 - n2;
        }
        public Double mul(Double n1,Double n2){
            return n1*n2;
        }
        public Double div(Double n1,Double n2)
        {
             Double divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0;
            }
            return divison;
        }
        public Double add(Integer n1,Double n2){
             return n1 + n2;
        }
        public Double sub(Integer n1,Double n2)
        {
            return n1 - n2;
        }
        public Double mul(Integer n1,Double n2){
            return n1*n2;
        }
        public Double div(Integer n1,Double n2)
        {
             Double divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0;
            }
            return divison;
        }
         public Double add(Double n1,Integer n2){
             return n1 + n2;
        }
        public Double sub(Double n1,Integer n2)
        {
            return n1 - n2;
        }
        public Double mul(Double n1,Integer n2){
            return n1*n2;
        }
        public Double div(Double n1,Integer n2)
        {
             Double divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0;
            }
            return divison;
        }
        public Float add(Integer n1,Float n2){
             return n1 + n2;
        }
        public Float sub(Integer n1,Float n2)
        {
            return n1 - n2;
        }
        public Float mul(Integer n1,Float n2){
            return n1*n2;
        }
        public Float div(Integer n1,Float n2)
        {
             Float divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0f;
            }
            return divison;
        }
         public Float add(Float n1,Integer n2){
             return n1 + n2;
        }
        public Float sub(Float n1,Integer n2)
        {
            return n1 - n2;
        }
        public Float mul(Float n1,Integer n2){
            return n1*n2;
        }
        public Float div(Float n1,Integer n2)
        {
             Float divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0f;
            }
            return divison;
        }
    public Double add(Double n1,Float n2){
        return n1 + n2;
    };
    public Double sub(Double n1,Float n2){
        return n1 - n2;
    };
    public Double mul(Double n1,Float n2){
        return n1 * n2;
    };
    public Double div(Double n1,Float n2){
        Double divison;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0;
            }
            return divison;
    };
    public Double add(Float n1,Double n2){
        return n1 + n2;
    };
    public Double sub(Float n1,Double n2){
        return n1 - n2;
    };
    public Double mul(Float n1,Double n2){
        return n1 * n2;
    };
    public Double div(Float n1,Double n2){
        Double divison ;
            try{
               divison  = n1/n2; 
            }catch(Exception ae)
            {
                ae.printStackTrace();
                return -1.0;
            }
            return divison;
    };
}