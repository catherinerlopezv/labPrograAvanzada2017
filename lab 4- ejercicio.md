##main (punteros)
/*int sumar(int a,int b){
    return a+b;
 }
 int resta(int a,int b){
    return a-b;
 }
 int multiplicar(int a,int b){
    return a*b;
 }
 int dividir(double a,double b){
    return a/b;
 } */
 
 void sumapunteros(int,int,int*);
 void restapunteros(int,int,int*);
 void multipunteros(int,int,int*);
 void divpunteros(int,int,int*);
 
int main()
{
    int resultado= 3;
    int resultadoRe= 2;
    int resultadoMu= 4;
    int resultadoDi= 5;
    sumapunteros(8,5, &resultado);
    restapunteros(8,5, &resultadoRe);
    
    divpunteros(8,5, &resultadoDi);
    
   /* int resultadoS=sumar(5,7);
    int resultadoR=resta(6,3);
    int resultadoM=multiplicar(6,3);
    double resultadoD=resta(6.0,3.0); */
  std::cout << "progra Avanzada lab 4" << std::endl;
  std::cout << "el resultado es: " << resultado << std::endl;
  std::cout << "el resultado es: " << resultadoRe << std::endl;
  std::cout << "el resultado es: " << resultadoMu << std::endl;
  std::cout << "el resultado es: " << resultadoDi << std::endl;
  /*std::cout << resultadoS << std::endl;
  std::cout << resultadoR << std::endl;
  std::cout << resultadoM << std::endl;
  std::cout << resultadoD << std::endl; */
  return 0;
}
void  sumapunteros(int a, int b, int* resultado)
{
     *resultado =a+b;
    
}
 

void  restapunteros(int a, int b, int* resultado)
{
     *resultado =a-b;
    
}
  

void  Multipunteros(int a, int b, int* resultado)
{
     *resultado =a*b;
    
}
  

void  divpunteros(int a, int b, int* resultado)
{
     *resultado =a/b;
    
}
  