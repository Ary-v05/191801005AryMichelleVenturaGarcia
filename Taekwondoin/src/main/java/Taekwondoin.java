/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Taekwondoin {
    
    //Atributos
    public String cinta, precisionDeGolpe, precisionDePatada, velocidadDeGolpe, velocidadDePatada;
    public int potenciaDePatada, potenciaDeGolpe, danioDeGolpe, danioDePatada;
   
    //Metodos
    @Override
    public String toString() {
        
    return "El Taekwondoin es cinta " + cinta+ ",danio de golpes  " +danioDeGolpe+ ",danio de Patada " +danioDePatada+ ",potencia de golpe" +potenciaDeGolpe+ ",potencia de Patada  " +potenciaDePatada+",precicion De golpe "+precisionDeGolpe+",precision de patada "+precisionDePatada + ",velocidad de golpes"+velocidadDeGolpe+",velocidad de patada"+velocidadDePatada;
            
    
    }
            
    
}
