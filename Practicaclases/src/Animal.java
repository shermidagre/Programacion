    public abstract class  Animal {

         String Nome;
        private  int idade;

        public Animal(String n, int i){
            setNome(n);
            setIdade(i);
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String nome) {
            this.Nome = nome;
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
            System.out.println( n + "Esta comiendo");
        }
        static  void durmir(){
            System.out.println( n + "Esta durmiendo");
        }

        public abstract void desprazarse();
    }
