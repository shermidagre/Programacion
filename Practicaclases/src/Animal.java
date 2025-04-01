    public abstract class  Animal {
        static String Nome;
        private  int idade;

        public Animal(String Nome, int idade){
            setNome(Nome);
            setIdade(idade);
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;

            if (idade<0){
                idade=0;
            }
            else {
                this.idade=idade;
            }

        }

        static void comer(){
            System.out.println( Nome + "Esta comiendo");
        }
        static  void durmir(){
            System.out.println( Nome + "Esta durmiendo");
        }

        public abstract void desprazarse();
    }
