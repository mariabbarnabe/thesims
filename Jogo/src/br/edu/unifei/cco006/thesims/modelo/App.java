/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco006.thesims.modelo;

import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author maria
 */
public class App {

    public static void main(String[] args) {

        //Definicao da cidade
        Cidade cidade1 = new Cidade();
        cidade1.setNome("Maria da Fé");
        cidade1.setTamanho(20000);
        System.out.println("------------------------------------------------");
        System.out.println("Bem Vindo a cidade de "+cidade1.getNome());
        System.out.println("------------------------------------------------");
        System.out.println("");
        
        Lugar academia = new Lugar();
        academia.setLugar(LugarEnum.ACADEMIA);
        academia.setPrivado(true);
        Lugar acampamento = new Lugar();
        acampamento.setLugar(LugarEnum.ACAMPAMENTO);
        acampamento.setPrivado(false);
        Lugar bar = new Lugar();
        bar.setLugar(LugarEnum.BAR);
        bar.setPrivado(true);
        Lugar escola = new Lugar();
        escola.setLugar(LugarEnum.ESCOLA);
        escola.setPrivado(false);
        Lugar hospital = new Lugar();
        hospital.setLugar(LugarEnum.HOSPITAL);
        hospital.setPrivado(false);
        Lugar igreja = new Lugar();
        igreja.setLugar(LugarEnum.IGREJA);
        igreja.setPrivado(false);
        Lugar praca = new Lugar();
        praca.setLugar(LugarEnum.PRACA);
        praca.setPrivado(false);
        Lugar restaurante = new Lugar();
        restaurante.setLugar(LugarEnum.RESTAURANTE);
        restaurante.setPrivado(true);
        Lugar shopping = new Lugar();
        shopping.setLugar(LugarEnum.SHOPPING);
        shopping.setPrivado(true);
        Lugar spa = new Lugar();
        spa.setLugar(LugarEnum.SPA);
        spa.setPrivado(true);
        
        cidade1.getConstrucoes().add(academia);
        cidade1.getConstrucoes().add(acampamento);
        cidade1.getConstrucoes().add(bar);
        cidade1.getConstrucoes().add(escola);
        cidade1.getConstrucoes().add(hospital);
        cidade1.getConstrucoes().add(igreja);
        cidade1.getConstrucoes().add(praca);
        cidade1.getConstrucoes().add(restaurante);
        cidade1.getConstrucoes().add(shopping);
        cidade1.getConstrucoes().add(spa);
        
        //Definicao dos personagens
        
        Familia familia1 = new Familia();
        familia1.setNome("Braga Barnabé");
        familia1.setDinheiro(10000.0f);
        System.out.println("------------------------------------------------");
        System.out.println("Família:"+familia1.getNome());
        System.out.println("Dinheiro:"+familia1.getDinheiro());
        System.out.println("------------------------------------------------");
        
        Pessoa pai = new Pessoa();
        pai.setNome("Renato");
        pai.setCorCabelo("Castanho");
        pai.setCorOlho("Castanho");
        pai.setCorPele("Branca");
        pai.setSexo("Masculino");
        pai.setIdade(52);
        
        Vestuario camisaPai = new Vestuario();
        camisaPai.setTipo(VestuarioEnum.CAMISETA);
        camisaPai.setCor("Branco");
        pai.getRoupas().add(camisaPai);
        Vestuario calcaPai = new Vestuario();
        calcaPai.setTipo(VestuarioEnum.CALCA);
        calcaPai.setCor("Jeans");
        pai.getRoupas().add(calcaPai);
        Vestuario sapatoPai = new Vestuario();
        sapatoPai.setTipo(VestuarioEnum.SAPATO);
        sapatoPai.setCor("Preto");
        pai.getRoupas().add(sapatoPai);
        
        Necessidade necessidadePai = new Necessidade();
        pai.setNecessidade(necessidadePai);
        Habilidade habilidadePai = new Habilidade();
        pai.setHabilidade(habilidadePai);
        
        //Inicializa as Necessidas e Habilidades
        pai.getNecessidade().setAmbiente(10);
        pai.getNecessidade().setBanheiro(10);
        pai.getNecessidade().setConforto(10);
        pai.getNecessidade().setDiversao(10);
        pai.getNecessidade().setEnergia(10);
        pai.getNecessidade().setFome(10);
        pai.getNecessidade().setHigiene(10);
        pai.getNecessidade().setSocial(10);
        
        pai.getHabilidade().setCarisma(0);
        pai.getHabilidade().setCriatividade(0);
        pai.getHabilidade().setFisico(0);
        pai.getHabilidade().setLogica(0);
        pai.getHabilidade().setMecanica(0);
        
        Pessoa mae = new Pessoa();
        mae.setNome("Ana Isabel");
        mae.setCorCabelo("Loiro");
        mae.setCorOlho("Castanho");
        mae.setCorPele("Branca");
        mae.setSexo("Feminino");
        mae.setIdade(56);
        
        Vestuario vestidoMae = new Vestuario();
        vestidoMae.setTipo(VestuarioEnum.VESTIDO);
        vestidoMae.setCor("vermelho");
        mae.getRoupas().add(vestidoMae);
        
        
        Necessidade necessidadeMae = new Necessidade();
        mae.setNecessidade(necessidadeMae);
        Habilidade habilidadeMae = new Habilidade();
        mae.setHabilidade(habilidadeMae);
        
        //Inicializa as Necessidas e Habilidades
        mae.getNecessidade().setAmbiente(10);
        mae.getNecessidade().setBanheiro(10);
        mae.getNecessidade().setConforto(10);
        mae.getNecessidade().setDiversao(10);
        mae.getNecessidade().setEnergia(10);
        mae.getNecessidade().setFome(10);
        mae.getNecessidade().setHigiene(10);
        mae.getNecessidade().setSocial(10);
        
        mae.getHabilidade().setCarisma(0);
        mae.getHabilidade().setCriatividade(0);
        mae.getHabilidade().setFisico(0);
        mae.getHabilidade().setLogica(0);
        mae.getHabilidade().setMecanica(0);
        
        Pessoa filho1 = new Pessoa();
        filho1.setNome("Maria Helena");
        filho1.setCorCabelo("Ruivo");
        filho1.setCorOlho("Castanho");
        filho1.setCorPele("Branca");
        filho1.setSexo("Feminino");
        filho1.setIdade(20);
        
        Vestuario vestidoFilho1 = new Vestuario();
        vestidoFilho1.setTipo(VestuarioEnum.VESTIDO);
        vestidoFilho1.setCor("Rosa");
        filho1.getRoupas().add(vestidoFilho1);
        
        Necessidade necessidadeFilho1 = new Necessidade();
        filho1.setNecessidade(necessidadeFilho1);
        Habilidade habilidadeFilho1 = new Habilidade();
        filho1.setHabilidade(habilidadeFilho1);
        
        //Inicializa as Necessidas e Habilidades
        filho1.getNecessidade().setAmbiente(10);
        filho1.getNecessidade().setBanheiro(10);
        filho1.getNecessidade().setConforto(10);
        filho1.getNecessidade().setDiversao(10);
        filho1.getNecessidade().setEnergia(10);
        filho1.getNecessidade().setFome(10);
        filho1.getNecessidade().setHigiene(10);
        filho1.getNecessidade().setSocial(10);
        
        filho1.getHabilidade().setCarisma(0);
        filho1.getHabilidade().setCriatividade(0);
        filho1.getHabilidade().setFisico(0);
        filho1.getHabilidade().setLogica(0);
        filho1.getHabilidade().setMecanica(0);
        
        
        Pessoa filho2 = new Pessoa();
        filho2.setNome("Ana Heloisa");
        filho2.setCorCabelo("Castanho");
        filho2.setCorOlho("Castanho");
        filho2.setCorPele("Branca");
        filho2.setSexo("Feminino");
        filho2.setIdade(19);
        
        Vestuario vestidoFilho2 = new Vestuario();
        vestidoFilho2.setTipo(VestuarioEnum.VESTIDO);
        vestidoFilho2.setCor("amarelo");
        filho2.getRoupas().add(vestidoFilho2);
        
        Necessidade necessidadeFilho2 = new Necessidade();
        filho2.setNecessidade(necessidadeFilho2);
        Habilidade habilidadeFilho2 = new Habilidade();
        filho2.setHabilidade(habilidadeFilho2);
        
        //Inicializa as Necessidades e Habilidades
        filho2.getNecessidade().setAmbiente(10);
        filho2.getNecessidade().setBanheiro(10);
        filho2.getNecessidade().setConforto(10);
        filho2.getNecessidade().setDiversao(10);
        filho2.getNecessidade().setEnergia(10);
        filho2.getNecessidade().setFome(10);
        filho2.getNecessidade().setHigiene(10);
        filho2.getNecessidade().setSocial(10);
        
        filho2.getHabilidade().setCarisma(0);
        filho2.getHabilidade().setCriatividade(0);
        filho2.getHabilidade().setFisico(0);
        filho2.getHabilidade().setLogica(0);
        filho2.getHabilidade().setMecanica(0);
        
        Pessoa avoPaterno = new Pessoa();
        avoPaterno.setNome("Joaquim");
        avoPaterno.setCorCabelo("Branco");
        avoPaterno.setCorOlho("Verde");
        avoPaterno.setCorPele("Branca");
        avoPaterno.setSexo("Masculino");
        avoPaterno.setIdade(78);
        
        Vestuario camisaVoPaterno = new Vestuario();
        camisaVoPaterno.setTipo(VestuarioEnum.CAMISETA);
        camisaVoPaterno.setCor("Verde");
        avoPaterno.getRoupas().add(camisaVoPaterno);
        Vestuario calcaVoPaterno = new Vestuario();
        calcaVoPaterno.setTipo(VestuarioEnum.CALCA);
        calcaVoPaterno.setCor("Jeans");
        avoPaterno.getRoupas().add(calcaVoPaterno);
        Vestuario sapatoVoPaterno = new Vestuario();
        sapatoVoPaterno.setTipo(VestuarioEnum.SAPATO);
        sapatoVoPaterno.setCor("Preto");
        avoPaterno.getRoupas().add(sapatoVoPaterno);
        
        Necessidade necessidadeAvoPaterno = new Necessidade();
        avoPaterno.setNecessidade(necessidadeAvoPaterno);
        Habilidade habilidadeAvoPaterno = new Habilidade();
        avoPaterno.setHabilidade(habilidadeAvoPaterno);
        
        //Inicializa as Necessidades e Habilidades
        avoPaterno.getNecessidade().setAmbiente(10);
        avoPaterno.getNecessidade().setBanheiro(10);
        avoPaterno.getNecessidade().setConforto(10);
        avoPaterno.getNecessidade().setDiversao(10);
        avoPaterno.getNecessidade().setEnergia(10);
        avoPaterno.getNecessidade().setFome(10);
        avoPaterno.getNecessidade().setHigiene(10);
        avoPaterno.getNecessidade().setSocial(10);
        
        avoPaterno.getHabilidade().setCarisma(0);
        avoPaterno.getHabilidade().setCriatividade(0);
        avoPaterno.getHabilidade().setFisico(0);
        avoPaterno.getHabilidade().setLogica(0);
        avoPaterno.getHabilidade().setMecanica(0);
        
        Pessoa avoPaterna = new Pessoa();
        avoPaterna.setNome("Regina");
        avoPaterna.setCorCabelo("Branco");
        avoPaterna.setCorOlho("Castanho");
        avoPaterna.setCorPele("Parda");
        avoPaterna.setSexo("Feminino");
        avoPaterna.setIdade(76);
        
        Vestuario vestidoVoPaterna = new Vestuario();
        vestidoVoPaterna.setTipo(VestuarioEnum.VESTIDO);
        vestidoVoPaterna.setCor("roxo");
        avoPaterna.getRoupas().add(vestidoVoPaterna);
        
        Necessidade necessidadeAvoPaterna = new Necessidade();
        avoPaterna.setNecessidade(necessidadeAvoPaterna);
        Habilidade habilidadeAvoPaterna = new Habilidade();
        avoPaterna.setHabilidade(habilidadeAvoPaterna);
        
        //Inicializa as Necessidades e Habilidades
        avoPaterna.getNecessidade().setAmbiente(10);
        avoPaterna.getNecessidade().setBanheiro(10);
        avoPaterna.getNecessidade().setConforto(10);
        avoPaterna.getNecessidade().setDiversao(10);
        avoPaterna.getNecessidade().setEnergia(10);
        avoPaterna.getNecessidade().setFome(10);
        avoPaterna.getNecessidade().setHigiene(10);
        avoPaterna.getNecessidade().setSocial(10);
        
        avoPaterna.getHabilidade().setCarisma(0);
        avoPaterna.getHabilidade().setCriatividade(0);
        avoPaterna.getHabilidade().setFisico(0);
        avoPaterna.getHabilidade().setLogica(0);
        avoPaterna.getHabilidade().setMecanica(0);
        
        Pessoa avoMaterno = new Pessoa();
        avoMaterno.setNome("Lemão");
        avoMaterno.setCorCabelo("Branco");
        avoMaterno.setCorOlho("Azul");
        avoMaterno.setCorPele("Branca");
        avoMaterno.setSexo("Masculino");
        avoMaterno.setIdade(84);
        
        Vestuario camisaVoMaterno = new Vestuario();
        camisaVoMaterno.setTipo(VestuarioEnum.CAMISETA);
        camisaVoMaterno.setCor("Azul");
        avoMaterno.getRoupas().add(camisaVoMaterno);
        Vestuario calcaVoMaterno = new Vestuario();
        calcaVoMaterno.setTipo(VestuarioEnum.CALCA);
        calcaVoMaterno.setCor("Jeans");
        avoMaterno.getRoupas().add(calcaVoMaterno);
        Vestuario sapatoVoMaterno = new Vestuario();
        sapatoVoMaterno.setTipo(VestuarioEnum.SAPATO);
        sapatoVoMaterno.setCor("Preto");
        avoMaterno.getRoupas().add(sapatoVoMaterno);
        
        Necessidade necessidadeAvoMaterno = new Necessidade();
        avoMaterno.setNecessidade(necessidadeAvoMaterno);
        Habilidade habilidadeAvoMaterno = new Habilidade();
        avoMaterno.setHabilidade(habilidadeAvoMaterno);
        
        //Inicializa as Necessidades e Habilidades
        avoMaterno.getNecessidade().setAmbiente(10);
        avoMaterno.getNecessidade().setBanheiro(10);
        avoMaterno.getNecessidade().setConforto(10);
        avoMaterno.getNecessidade().setDiversao(10);
        avoMaterno.getNecessidade().setEnergia(10);
        avoMaterno.getNecessidade().setFome(10);
        avoMaterno.getNecessidade().setHigiene(10);
        avoMaterno.getNecessidade().setSocial(10);
        
        avoMaterno.getHabilidade().setCarisma(0);
        avoMaterno.getHabilidade().setCriatividade(0);
        avoMaterno.getHabilidade().setFisico(0);
        avoMaterno.getHabilidade().setLogica(0);
        avoMaterno.getHabilidade().setMecanica(0);
        
        Pessoa avoMaterna = new Pessoa();
        avoMaterna.setNome("Tereza");
        avoMaterna.setCorCabelo("Branco");
        avoMaterna.setCorOlho("Roxo");
        avoMaterna.setCorPele("Branca");
        avoMaterna.setSexo("Feminino");
        avoMaterna.setIdade(78);
        
        Vestuario vestidoVoMaterna = new Vestuario();
        vestidoVoMaterna.setTipo(VestuarioEnum.VESTIDO);
        vestidoVoMaterna.setCor("Laranja");
        avoMaterna.getRoupas().add(vestidoVoMaterna);
        
        Necessidade necessidadeAvoMaterna = new Necessidade();
        avoMaterna.setNecessidade(necessidadeAvoMaterna);
        Habilidade habilidadeAvoMaterna = new Habilidade();
        avoMaterna.setHabilidade(habilidadeAvoMaterna);
        
        //Inicializa as Necessidades e Habilidades
        avoMaterna.getNecessidade().setAmbiente(10);
        avoMaterna.getNecessidade().setBanheiro(10);
        avoMaterna.getNecessidade().setConforto(10);
        avoMaterna.getNecessidade().setDiversao(10);
        avoMaterna.getNecessidade().setEnergia(10);
        avoMaterna.getNecessidade().setFome(10);
        avoMaterna.getNecessidade().setHigiene(10);
        avoMaterna.getNecessidade().setSocial(10);
        
        avoMaterna.getHabilidade().setCarisma(0);
        avoMaterna.getHabilidade().setCriatividade(0);
        avoMaterna.getHabilidade().setFisico(0);
        avoMaterna.getHabilidade().setLogica(0);
        avoMaterna.getHabilidade().setMecanica(0);
        
        avoPaterno.getFilhos().add(pai);
        avoPaterna.getFilhos().add(pai);
        avoMaterno.getFilhos().add(mae);
        avoMaterna.getFilhos().add(mae);
        pai.getFilhos().add(filho1);
        pai.getFilhos().add(filho2);
        mae.getFilhos().add(filho1);
        mae.getFilhos().add(filho2);

        pai.setConjuge(mae);
        mae.setConjuge(pai);
        avoPaterno.setConjuge(avoPaterna);
        avoPaterna.setConjuge(avoPaterno);
        avoMaterno.setConjuge(avoMaterna);
        avoMaterna.setConjuge(avoMaterno);
               
        familia1.getMembros().add(pai);
        familia1.getMembros().add(mae);
        familia1.getMembros().add(filho1);
        familia1.getMembros().add(filho2);
        familia1.getMembros().add(avoPaterno);
        familia1.getMembros().add(avoPaterna);
        familia1.getMembros().add(avoMaterno);
        familia1.getMembros().add(avoMaterna);
        
        
        System.out.println("--------Membros:---------");
        for (int i = 0; i < familia1.getMembros().size(); i++) {
            System.out.println("Nome:"+familia1.getMembros().get(i).getNome());
            System.out.println("Cabelo:"+familia1.getMembros().get(i).getCorCabelo());
            System.out.println("Olhos:"+familia1.getMembros().get(i).getCorOlho());
            System.out.println("Pele:"+familia1.getMembros().get(i).getCorPele());
            System.out.println("Sexo:"+familia1.getMembros().get(i).getSexo());
            System.out.println("Idade:"+familia1.getMembros().get(i).getIdade());
            System.out.println("Conjuge:"+familia1.getMembros().get(i).getConjuge());
            System.out.println("**Filhos:");
            for (int j = 0; j < familia1.getMembros().get(i).getFilhos().size(); j++) {
                System.out.println(familia1.getMembros().get(i).getFilhos().get(j).getNome());
            }
            System.out.println("Roupas:");
            for (int k = 0; k < familia1.getMembros().get(i).getRoupas().size(); k++) {
                System.out.println(familia1.getMembros().get(i).getRoupas().get(k).getTipo()+" "+familia1.getMembros().get(i).getRoupas().get(k).getCor());
                
            }
            System.out.println("");
            
        }
        
        //Definicao da Casa
        System.out.println("------------------------------------------------");
        System.out.println("Construindo a primeira casa");
        System.out.println("------------------------------------------------");
        
        Casa casa1 = new Casa();
        casa1.setPreco(5000.0f);
        casa1.setTamanho(250);
        casa1.setCorParede("Rosa");
        casa1.setCorTelhado("Vermelho");
        casa1.setPrivado(true);
        cidade1.getConstrucoes().add(casa1);
        
        Comodo quarto1 = new Comodo();
        quarto1.setComodo(ComodoEnum.QUARTO);
        Comodo quarto2 = new Comodo();
        quarto2.setComodo(ComodoEnum.QUARTO);
        Comodo quarto3 = new Comodo();
        quarto3.setComodo(ComodoEnum.QUARTO);
        Comodo banheiro1 = new Comodo();
        banheiro1.setComodo(ComodoEnum.BANHEIRO);
        Comodo banheiro2 = new Comodo();
        banheiro2.setComodo(ComodoEnum.BANHEIRO);
        Comodo cozinha = new Comodo();
        cozinha.setComodo(ComodoEnum.COZINHA);
        Comodo sala = new Comodo();
        sala.setComodo(ComodoEnum.SALA);
        Comodo servico = new Comodo();
        servico.setComodo(ComodoEnum.SERVICO);
        Comodo quintal = new Comodo();
        quintal.setComodo(ComodoEnum.QUINTAL);
        Comodo escritorio = new Comodo();
        escritorio.setComodo(ComodoEnum.ESCRITORIO);
        
        casa1.getComodo().add(quarto1);
        casa1.getComodo().add(quarto2);
        casa1.getComodo().add(quarto3);
        casa1.getComodo().add(banheiro1);
        casa1.getComodo().add(banheiro2);
        casa1.getComodo().add(cozinha);
        casa1.getComodo().add(sala);
        casa1.getComodo().add(servico);
        casa1.getComodo().add(quintal);
        casa1.getComodo().add(escritorio);
        
        
        // teste pra ver se o método funciona
        System.out.println("------------------------------------------------");
        System.out.println("Construindo a segunda casa");
        System.out.println("------------------------------------------------");
        Casa casa2 = new Casa();
        casa2.setPreco(50000.f);
        cidade1.getConstrucoes().add(casa2);
        familia1.comprarCasa(casa2);
        
        familia1.comprarCasa(casa1);
        System.out.println("dinheiro:"+familia1.getDinheiro());
        
        // Mobiliando a casa
        System.out.println("\nMobiliando a casa");
        //Mobiliando o quarto1
        Mobilia cama1 = new Mobilia();
        cama1.setMobilia(MobiliaEnum.CAMA);
        cama1.setPreco(100);
        quarto1.getMobilia().add(cama1);
        Mobilia roupeiro1 = new Mobilia();
        roupeiro1.setMobilia(MobiliaEnum.ROUPEIRO);
        roupeiro1.setPreco(100);
        quarto1.getMobilia().add(roupeiro1);
        Mobilia poltrona1 =  new Mobilia();
        poltrona1.setMobilia(MobiliaEnum.POLTRONA);
        poltrona1.setPreco(30);
        quarto1.getMobilia().add(poltrona1);
        
        Objeto abajur1 = new Objeto();
        abajur1.setObjeto(ObjetoEnum.ABAJUR);
        abajur1.setPreco(2);
        quarto1.getObjetos().add(abajur1);
        Objeto quadro1 = new Objeto();
        quadro1.setObjeto(ObjetoEnum.QUADRO);
        quadro1.setPreco(1);
        quarto1.getObjetos().add(quadro1);
        
        //Mobiliando o quarto2
        
        Mobilia cama2 = new Mobilia();
        cama2.setPreco(100);
        cama2.setMobilia(MobiliaEnum.CAMA);
        quarto2.getMobilia().add(cama2);
        Mobilia roupeiro2 = new Mobilia();
        roupeiro2.setMobilia(MobiliaEnum.ROUPEIRO);
        roupeiro2.setPreco(100);
        quarto2.getMobilia().add(roupeiro2);
        Mobilia poltrona2 =  new Mobilia();
        poltrona2.setMobilia(MobiliaEnum.POLTRONA);
        poltrona2.setPreco(30);
        quarto2.getMobilia().add(poltrona2);
        
        Objeto abajur2 = new Objeto();
        abajur2.setObjeto(ObjetoEnum.ABAJUR);
        abajur2.setPreco(2);
        quarto2.getObjetos().add(abajur2);
        Objeto quadro2 = new Objeto();
        quadro2.setObjeto(ObjetoEnum.QUADRO);
        quadro2.setPreco(2);
        quarto2.getObjetos().add(quadro2);
        Objeto boneca = new Objeto();
        boneca.setObjeto(ObjetoEnum.BONECA);
        boneca.setPreco(2);
        quarto2.getObjetos().add(boneca);
        Objeto brinquedo = new Objeto();
        brinquedo.setObjeto(ObjetoEnum.BRINQUEDO);
        brinquedo.setPreco(2);
        quarto2.getObjetos().add(brinquedo);
        
        //Mobiliando o quarto3
        
        Mobilia cama3 = new Mobilia();
        cama3.setMobilia(MobiliaEnum.CAMA);
        cama3.setPreco(100);
        quarto3.getMobilia().add(cama3);
        Mobilia roupeiro3 = new Mobilia();
        roupeiro3.setMobilia(MobiliaEnum.ROUPEIRO);
        roupeiro3.setPreco(100);
        quarto3.getMobilia().add(roupeiro3);
        Mobilia poltrona3 =  new Mobilia();
        poltrona1.setMobilia(MobiliaEnum.POLTRONA);
        poltrona3.setPreco(30);
        quarto3.getMobilia().add(poltrona3);
        
        Objeto abajur3 = new Objeto();
        abajur3.setObjeto(ObjetoEnum.ABAJUR);
        abajur3.setPreco(2);
        quarto3.getObjetos().add(abajur3);
        Objeto quadro3 = new Objeto();
        quadro3.setObjeto(ObjetoEnum.QUADRO);
        quadro3.setPreco(2);
        quarto3.getObjetos().add(quadro3);
        
        //Mobiliando o banheiro1
        
        Mobilia sanitario1 = new Mobilia();
        sanitario1.setMobilia(MobiliaEnum.SANITARIO);
        sanitario1.setPreco(50);
        banheiro1.getMobilia().add(sanitario1);
        Mobilia pia1 = new Mobilia();
        pia1.setMobilia(MobiliaEnum.PIA);
        pia1.setPreco(50);
        banheiro1.getMobilia().add(pia1);
        
        //Mobiliando o banheiro2
        
        Mobilia sanitario2 = new Mobilia();
        sanitario2.setMobilia(MobiliaEnum.SANITARIO);
        sanitario2.setPreco(50);
        banheiro2.getMobilia().add(sanitario2);
        Mobilia pia2 = new Mobilia();
        pia2.setMobilia(MobiliaEnum.PIA);
        pia2.setPreco(50);
        banheiro1.getMobilia().add(pia2);
        
        //Mobiliando a cozinha
        
        Mobilia fogao = new Mobilia();
        fogao.setMobilia(MobiliaEnum.FOGAO);
        fogao.setPreco(100);
        cozinha.getMobilia().add(fogao);
        Mobilia geladeira = new Mobilia();
        geladeira.setMobilia(MobiliaEnum.GELADEIRA);
        geladeira.setPreco(200);
        cozinha.getMobilia().add(geladeira);
        Mobilia mesa = new Mobilia();
        mesa.setMobilia(MobiliaEnum.MESA);
        mesa.setPreco(20);
        cozinha.getMobilia().add(mesa);
        Mobilia cadeira1 = new Mobilia();
        cadeira1.setMobilia(MobiliaEnum.CADEIRA);
        cadeira1.setPreco(5);
        cozinha.getMobilia().add(cadeira1);
        Mobilia cadeira2 = new Mobilia();
        cadeira2.setMobilia(MobiliaEnum.CADEIRA);
        cadeira2.setPreco(5);
        cozinha.getMobilia().add(cadeira2);
        Mobilia cadeira3 = new Mobilia();
        cadeira3.setMobilia(MobiliaEnum.CADEIRA);
        cadeira3.setPreco(5);
        cozinha.getMobilia().add(cadeira3);
        Mobilia cadeira4 = new Mobilia();
        cadeira4.setMobilia(MobiliaEnum.CADEIRA);
        cadeira4.setPreco(5);
        cozinha.getMobilia().add(cadeira4);
        Mobilia armario = new Mobilia();
        armario.setMobilia(MobiliaEnum.ARMARIO);
        armario.setPreco(100);
        cozinha.getMobilia().add(armario);
        
        Objeto alarme = new Objeto();
        alarme.setObjeto(ObjetoEnum.ALARME);
        alarme.setPreco(20);
        cozinha.getObjetos().add(alarme);
        
        //Mobiliando a sala
        
        Mobilia sofa = new Mobilia();
        sofa.setMobilia(MobiliaEnum.SOFA);
        sofa.setPreco(50);
        sala.getMobilia().add(sofa);
        Mobilia tv = new Mobilia();
        tv.setMobilia(MobiliaEnum.TV);
        tv.setPreco(50);
        sala.getMobilia().add(tv);
        
        Objeto quadro4 = new Objeto();
        quadro4.setObjeto(ObjetoEnum.QUADRO);
        quadro4.setPreco(2);
        sala.getObjetos().add(quadro4);
        Objeto telefone = new Objeto();
        telefone.setObjeto(ObjetoEnum.TELEFONE);
        telefone.setPreco(10);
        sala.getObjetos().add(telefone);
        Objeto videoGame = new Objeto();
        videoGame.setObjeto(ObjetoEnum.VIDEOGAME);
        videoGame.setPreco(50);
        sala.getObjetos().add(videoGame);
        
        //Mobiliando a area de servico
        
        Mobilia lavadoura = new Mobilia();
        lavadoura.setMobilia(MobiliaEnum.LAVADOURA);
        lavadoura.setPreco(100);
        servico.getMobilia().add(lavadoura);
        
        //Mobiliando o quintal
        
        Mobilia piscina = new Mobilia();
        piscina.setMobilia(MobiliaEnum.PISCINA);
        piscina.setPreco(200);
        quintal.getMobilia().add(piscina);
        
        Objeto churrasqueira = new Objeto();
        churrasqueira.setObjeto(ObjetoEnum.CHURRASQUEIRA);
        churrasqueira.setPreco(50);
        quintal.getObjetos().add(churrasqueira);
        Objeto cavalete = new Objeto();
        cavalete.setObjeto(ObjetoEnum.CAVALETE);
        cavalete.setPreco(30);
        quintal.getObjetos().add(cavalete);
        Objeto musculacao = new Objeto();
        musculacao.setObjeto(ObjetoEnum.APARELHOMUSCULACAO);
        musculacao.setPreco(100);
        quintal.getObjetos().add(musculacao);
        
        
        //Mobiliando o escritorio
        
        Mobilia mesa2 = new Mobilia();
        mesa2.setMobilia(MobiliaEnum.MESA);
        mesa2.setPreco(20);
        escritorio.getMobilia().add(mesa2);
        Mobilia cadeira5 = new Mobilia();
        cadeira5.setMobilia(MobiliaEnum.CADEIRA);
        cadeira5.setPreco(5);
        escritorio.getMobilia().add(cadeira5);
        Mobilia armario2 = new Mobilia();
        armario2.setMobilia(MobiliaEnum.ARMARIO);
        armario2.setPreco(100);
        escritorio.getMobilia().add(armario2);
        
        Objeto computador = new Objeto();
        computador.setObjeto(ObjetoEnum.COMPUTADOR);
        computador.setPreco(50);
        escritorio.getObjetos().add(computador);
        Objeto violao = new Objeto();
        violao.setObjeto(ObjetoEnum.VIOLAO);
        violao.setPreco(30);
        escritorio.getObjetos().add(violao);
        Objeto livro = new Objeto();
        livro.setObjeto(ObjetoEnum.LIVRO);
        livro.setPreco(2);
        escritorio.getObjetos().add(livro);
        //Compra
        System.out.println("------------------------------------------------");
        System.out.println("Compra dos móveis");
        familia1.comprarMovel(casa1);
        System.out.println("------------------------------------------------");
        System.out.println("Compra dos objetos");
        familia1.comprarObjeto(casa1);
        System.out.println("------------------------------------------------");

        System.out.println("Dinheiro:" + familia1.getDinheiro());
        System.out.println("------------------------------------------------");

        // Com a casa pronta e mobiliada, começa as acoes
        System.out.println("Acoes");
        System.out.println("------------------------------------------------");

        Movimento correr = new Movimento();
        correr.setPessoa(pai);
        correr.setAcao(MovimentoEnum.CORRER);
        correr.setDestino(escritorio);
        System.out.println(correr);
        correr.atualizaNecessidade();
        correr.atualizaHabilidade();
        
        
        Lazer malhar = new Lazer();
        malhar.setPessoa(pai);
        malhar.setAcao(LazerEnum.MALHAR);
        System.out.println(malhar);
        malhar.atualizaNecessidade();
        malhar.atualizaHabilidade();
        
        
        Movimento andarCozinha = new Movimento();
        andarCozinha.setPessoa(mae);
        andarCozinha.setAcao(MovimentoEnum.ANDAR);
        andarCozinha.setDestino(cozinha);
        System.out.println(andarCozinha);
        andarCozinha.atualizaNecessidade();
        andarCozinha.atualizaHabilidade();
        
        Tarefa limpar = new Tarefa();
        limpar.setPessoa(mae);
        limpar.setAcao(TarefaEnum.LIMPAR);
        System.out.println(limpar);
        limpar.atualizaNecessidade();
        limpar.atualizaHabilidade();
        
        Movimento andarQuarto1 = new Movimento();
        andarQuarto1.setPessoa(filho1);
        andarQuarto1.setAcao(MovimentoEnum.ANDAR);
        andarQuarto1.setDestino(quarto2);
        System.out.println(andarQuarto1);
        andarQuarto1.atualizaNecessidade();
        andarQuarto1.atualizaHabilidade();
        
        Movimento andarQuarto2 = new Movimento();
        andarQuarto2.setPessoa(filho2);
        andarQuarto2.setAcao(MovimentoEnum.ANDAR);
        andarQuarto2.setDestino(quarto2);
        System.out.println(andarQuarto2);
        andarQuarto2.atualizaNecessidade();
        andarQuarto2.atualizaHabilidade();
        
        Relacionamento briga1 = new Relacionamento();
        briga1.setPessoa(filho1);
        briga1.setAcao(RelacionamentoEnum.BRIGAR);
        briga1.setInterlocutor(filho2);
        briga1.setComodo(quarto2);
        System.out.println(briga1);
        briga1.atualizaNecessidade();
        briga1.atualizaHabilidade();
        
        Relacionamento briga2 = new Relacionamento();
        briga2.setPessoa(filho2);
        briga2.setAcao(RelacionamentoEnum.BRIGAR);
        briga2.setInterlocutor(filho1);
        briga2.setComodo(quarto2);
        System.out.println(briga2);
        briga2.atualizaNecessidade();
        briga2.atualizaHabilidade();
        
        Movimento andarEscritorio = new Movimento();
        andarEscritorio.setPessoa(avoMaterno);
        andarEscritorio.setAcao(MovimentoEnum.ANDAR);
        andarEscritorio.setDestino(escritorio);
        System.out.println(andarEscritorio);
        andarEscritorio.atualizaNecessidade();
        andarEscritorio.atualizaHabilidade();
        
        Lazer ler = new Lazer();
        ler.setPessoa(avoMaterno);
        ler.setAcao(LazerEnum.LER);
        ler.setObjeto(livro);
        System.out.println(ler);
        ler.atualizaNecessidade();
        ler.atualizaHabilidade();
        
        Movimento andarServico = new Movimento();
        andarServico.setPessoa(avoMaterna);
        andarServico.setAcao(MovimentoEnum.ANDAR);
        andarServico.setDestino(servico);
        System.out.println(andarServico);
        andarServico.atualizaNecessidade();
        andarServico.atualizaHabilidade();
        
        Tarefa lavar = new Tarefa();
        lavar.setPessoa(avoMaterna);
        lavar.setAcao(TarefaEnum.LAVAR);
        lavar.setComodo(servico);
        System.out.println(lavar);
        lavar.atualizaNecessidade();
        lavar.atualizaHabilidade();
        
        Movimento andarSala = new Movimento();
        andarSala.setPessoa(avoPaterno);
        andarSala.setAcao(MovimentoEnum.ANDAR);
        andarSala.setDestino(sala);
        System.out.println(andarSala);
        andarSala.atualizaNecessidade();
        andarSala.atualizaHabilidade();
        
        Movimento sentarSala = new Movimento();
        sentarSala.setPessoa(avoPaterno);
        sentarSala.setAcao(MovimentoEnum.SENTAR);
        sentarSala.setDestino(sala);
        System.out.println(sentarSala);
        sentarSala.atualizaNecessidade();
        sentarSala.atualizaHabilidade();
        
        System.out.println("Verifica os metodos de Pessoa");
        
        Movimento andarQuarto3 = new Movimento();
        andarQuarto3.setPessoa(avoPaterna);
        andarQuarto3.setAcao(MovimentoEnum.ANDAR);
        andarQuarto3.setDestino(quarto3);
        System.out.println(andarQuarto3);
        andarQuarto3.atualizaNecessidade();
        andarQuarto3.atualizaHabilidade();
        
        Lazer dancar = new Lazer();
        dancar.setPessoa(avoPaterna);
        dancar.setAcao(LazerEnum.DANCAR);
        System.out.println(dancar);
        dancar.atualizaNecessidade();
        dancar.atualizaHabilidade();
        
        dancar.atualizaNecessidade();
        dancar.atualizaHabilidade();
        
        dancar.atualizaNecessidade();
        dancar.atualizaHabilidade();
        
        dancar.atualizaNecessidade();
        dancar.atualizaHabilidade();
        
        dancar.atualizaNecessidade();
        dancar.atualizaHabilidade();
        
        avoPaterna.tomarBanho();
        System.out.println(avoPaterna.getNecessidade()+"\n");
        avoPaterna.dormir();
        System.out.println(avoPaterna.getNecessidade()+"\n");
        
        
        //Eventos
        System.out.println("------------------------------------------------");
        System.out.println("Eventos");
        System.out.println("------------------------------------------------");
        
        Evento missa  = new Evento();
        missa.setDescricao("Missa");
        missa.setHora(LocalDateTime.of(2017, Month.JUNE, 19, 19, 00));
        missa.setLocal(igreja);
        missa.getPessoas().add(avoPaterna);
        missa.getPessoas().add(avoMaterna);
        missa.getPessoas().add(mae);
        
        System.out.println(missa);
        
        Evento buteco = new Evento();
        buteco.setDescricao("Happy Hour");
        buteco.setHora(LocalDateTime.of(2017, Month.JUNE, 19, 19, 15));
        buteco.setLocal(bar);
        buteco.getPessoas().add(avoPaterno);
        buteco.getPessoas().add(avoMaterno);
        buteco.getPessoas().add(pai);
               
        System.out.println(buteco);
        

        //Trabalho
        System.out.println("------------------------------------------------");
        System.out.println("Trabalho");
        System.out.println("------------------------------------------------");
        
        Trabalho trabalho1 = new Trabalho();
        trabalho1.setCargo("Ordenhador");
        trabalho1.setDescricao("Tirar leite das vacas");
        trabalho1.setSalario(500);
        trabalho1.setHorasDiarias(12);
        trabalho1.getPessoas().add(pai);
        trabalho1.getPessoas().add(avoPaterno);
        System.out.println(trabalho1);
        
        Trabalho trabalho2 = new Trabalho();
        trabalho2.setCargo("Professor");
        trabalho2.setDescricao("Ensinar os alunos");
        trabalho2.setSalario(500);
        trabalho2.setHorasDiarias(8);
        trabalho2.getPessoas().add(mae);
        System.out.println(trabalho2);
        


        //A morte de um personagem
        System.out.println("------------------------------------------------");
        System.out.println("A morte de um personagem");
        System.out.println("------------------------------------------------");
        Movimento andarPiscina = new Movimento();
        andarPiscina.setPessoa(filho1);
        andarPiscina.setAcao(MovimentoEnum.ANDAR);
        andarPiscina.setDestino(quintal);
        System.out.println(andarPiscina);
        andarPiscina.atualizaNecessidade();
        andarPiscina.atualizaHabilidade();
        
        Movimento nadar = new Movimento();
        nadar.setPessoa(filho1);
        nadar.setAcao(MovimentoEnum.NADAR);
        nadar.setDestino(quintal);
        System.out.println(nadar);
        nadar.atualizaNecessidade();
        nadar.atualizaHabilidade();

        nadar.atualizaNecessidade();
        nadar.atualizaHabilidade();
        
        nadar.atualizaNecessidade();
        nadar.atualizaHabilidade();
        

        Alimentar comer = new Alimentar();
        comer.setPessoa(filho1);
        comer.atualizaNecessidade();

    }
}
