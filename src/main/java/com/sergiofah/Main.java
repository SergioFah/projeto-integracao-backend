package com.sergiofah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {


    public static void main(String[] args){
        SpringApplication.run(Main.class, args);

        System.out.println("Teste");
    /*
        //POPULA O BANCO DE DADOS
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto-integracao-backend");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        //LINHAS
        Line ares = new Line("Ares");
        entityManager.persist(ares);
        Line cronos = new Line("Cronos");
        entityManager.persist(cronos);

        //CATEGORIAS
        Category cronosOld = new Category(cronos, "Cronos Old");
        entityManager.persist(cronosOld);
        Category cronosL = new Category(cronos, "Cronos L");
        entityManager.persist(cronosL);
        Category cronosNg = new Category(cronos, "Cronos-NG");
        entityManager.persist(cronosNg);

        Category aresTB = new Category(ares, "Ares TB");
        entityManager.persist(aresTB);
        Category aresTHS = new Category(ares, "Ares THS");
        entityManager.persist(aresTHS);

        //PRODUTOS
        Product cronos6001A = new Product(cronos, cronosOld, "Cronos 6001‑A", "Este modelo monofásico atende as necessidades das concessionárias de energia elétrica. É um medidor compacto com dimensões compatíveis as instalações e equipamentos de calibração já existentes. Fabricado com materiais de alta tecnologia e modernas técnicas de produção, o medidor eletrônico Cronos 6001-A, é uma solução totalmente nacional para medição de elétrica, com preço extremamente competitivo.", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png");
        entityManager.persist(cronos6001A);

        Product cronos6003 = new Product(cronos, cronosOld, "Cronos 6003", "Com a mais moderna tecnologia disponível no mercado, os medidores da linha Cronos polifásica oferecem a conhecida confiabilidade dos produtos Eletra. Uma solução efetiva de custo para aplicação em consumidores residenciais com ligações em sistemas estrela a quatro fios (medição trifásica) ou três fios (medição bifásica).", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Cronos-6003.png");
        entityManager.persist(cronos6003);

        Product cronos7023 = new Product(cronos, cronosOld, "Cronos 7023", "O Cronos 7023 é um medidor eletrônico de energia ativa e reativa, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica) ou três fios (medição bifásica). Este medidor conta com um mostrador digital em LCD e foi desenvolvido com uma estrutura mecânica de alta resistência e recursos que ajudam a prevenir fraudes, reduzindo as perdas comerciais das distribuidoras de energia.", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Cronos-7023.png");
        entityManager.persist(cronos7023);

        Product cronos6021l = new Product(cronos, cronosL, "Cronos 6021L", "Os medidores Cronos 6021L são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.", "https://casaferreira.fbitsstatic.net/img/p/medidor-eletra-monofasico-cronos-6021l-100a-110-240v-1-elemento-2-fios-kwh-83690/270361-1.jpg?w=570&h=570&v=no-change&qs=ignore");
        entityManager.persist(cronos6021l);

        Product cronos7023l = new Product(cronos, cronosL, "Cronos 7023L",  "Os medidores Cronos 7023L são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-7023L.png");
        entityManager.persist(cronos7023l);

        Product cronos6001ng = new Product(cronos, cronosNg, "Cronos 6001‑NG", "Este modelo monofásico atende as necessidades das concessionárias de energia elétrica. É um medidor compacto com dimensões compatíveis as instalações e equipamentos de calibração já existentes. Fabricado com materiais de alta tecnologia e modernas técnicas de produção, o medidor eletrônico Cronos 6001-A, é uma solução totalmente nacional para medição de elétrica, com preço extremamente competitivo.", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png");
        entityManager.persist(cronos6001ng);

        Product cronos6003ng = new Product(cronos, cronosNg, "Cronos 6003‑NG", "Com a mais moderna tecnologia disponível no mercado, os medidores da linha Cronos polifásica oferecem a conhecida confiabilidade dos produtos Eletra. Uma solução efetiva de custo para aplicação em consumidores residenciais com ligações em sistemas estrela a quatro fios (medição trifásica) ou três fios (medição bifásica).", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Cronos-6003.png");
        entityManager.persist(cronos6003ng);

        Product cronos6021ng = new Product(cronos, cronosNg, "Cronos 6021‑NG", "Os medidores Cronos 6021-NG são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png");
        entityManager.persist(cronos6021ng);

        Product cronos6031ng = new Product(cronos, cronosNg, "Cronos 6031‑NG", "Medidor de Energia para individualização interna. Mede 110V e 220V, neutro NÃO passa no medidor, exclusivo para redes de 1 elemento", "https://acdn.mitiendanube.com/stores/001/446/686/products/mono-3fios-leve11-a6f024213526240df716570053321597-1024-1024.png");
        entityManager.persist(cronos6031ng);

        Product cronos7021ng = new Product(cronos, cronosNg, "Cronos 7021‑NG", "O medidor ARES 7021-NG auxilia as concessionárias de energia a obter informações referentes ao consumo de energia de seus clientes. Projetado para operar em redes monofásicas a dois fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7021.png");
        entityManager.persist(cronos7021ng);

        Product cronos7023ng = new Product(cronos, cronosNg, "Cronos 7023‑NG", "Os medidores Cronos 7023-NG são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png");
        entityManager.persist(cronos7023ng);


        Product ares7021 = new Product(ares, aresTB, "ARES 7021", "O medidor ARES 7021 auxilia as concessionárias de energia a obter informações referentes ao consumo de energia de seus clientes. Projetado para operar em redes monofásicas a dois fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7021.png");
        entityManager.persist(ares7021);

        Product ares7031 = new Product(ares, aresTB, "ARES 7031", "O medidor Ares 7031 auxilia as concessionárias de energia a obter informações referentes ao consumo de energia elétrica de seus clientes. Projetado para operar em redes monofásicas a três fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7031.png");
        entityManager.persist(ares7031);

        Product ares7023 = new Product(ares, aresTB, "ARES 7023", "O medidor Ares 7023 auxilia as concessionárias de energia a obter informações referentes ao consumo de energia elétrica de seus clientes. Projetado para operar em redes monofásicas a três ou quatro fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png");
        entityManager.persist(ares7023);

        Product ares802325 = new Product(ares, aresTHS, "ARES 8023 2,5", "O Ares 8023 é um medidor eletrônico Multifunção, bidirecional, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica). Ele indicado para medição de consumidores com tarifa horosazonal (THS) e clientes comerciais e industriais. BENEFÍCIOS: – Confiabilidade da medição; – Display LCD parametrizável; – Diagnóstico de instalação;", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023.png");
        entityManager.persist(ares802325);

        Product ares8023200 = new Product(ares, aresTHS, "ARES  8023 200", "O Ares 8023 200 é um medidor eletrônico Multifunção, bidirecional, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica). Ele é indicado para medição de consumidores com tarifa horosazonal (THS) e clientes comerciais e industriais. BENEFÍCIOS: – Confiabilidade da medição; – Display LCD parametrizável;", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-200.png");
        entityManager.persist(ares8023200);

        Product ares802315 = new Product(ares, aresTHS, "ARES 8023 15", "O Ares 8023 15 é um medidor eletrônico Multifunção, bidirecional, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica). Ele é indicado para medição de consumidores com tarifa horosazonal (THS) e clientes comerciais e industriais. BENEFÍCIOS: – Confiabilidade da medição; – Display LCD parametrizável; – Diagnóstico de instalação;", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-15.png");
        entityManager.persist(ares802315);

        entityManager.getTransaction().commit();

    */

    }
}