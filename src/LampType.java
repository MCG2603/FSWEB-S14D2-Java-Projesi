public enum LampType {

        BIG( "BUYUK"), SMALL("KUCUK");
        private String name;




        public void setName(String name) {
            this.name = name;
        }



    LampType( String name){

            this.name = name;
        }



        public String getName(){
            return name;
        }

    }



