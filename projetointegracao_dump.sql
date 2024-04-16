--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-04-15 12:59:04

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 16730)
-- Name: category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.category (
    id bigint NOT NULL,
    category character varying(255),
    line_id bigint
);


ALTER TABLE public.category OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16729)
-- Name: category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.category_id_seq OWNER TO postgres;

--
-- TOC entry 4870 (class 0 OID 0)
-- Dependencies: 215
-- Name: category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.category_id_seq OWNED BY public.category.id;


--
-- TOC entry 218 (class 1259 OID 16737)
-- Name: line; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.line (
    id bigint NOT NULL,
    line character varying(255)
);


ALTER TABLE public.line OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16736)
-- Name: line_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.line_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.line_id_seq OWNER TO postgres;

--
-- TOC entry 4871 (class 0 OID 0)
-- Dependencies: 217
-- Name: line_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.line_id_seq OWNED BY public.line.id;


--
-- TOC entry 220 (class 1259 OID 16744)
-- Name: product; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product (
    id bigint NOT NULL,
    description text,
    image_url character varying(255),
    model character varying(255),
    category_id bigint,
    line_id bigint
);


ALTER TABLE public.product OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16743)
-- Name: product_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.product_id_seq OWNER TO postgres;

--
-- TOC entry 4872 (class 0 OID 0)
-- Dependencies: 219
-- Name: product_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.product_id_seq OWNED BY public.product.id;


--
-- TOC entry 4698 (class 2604 OID 16733)
-- Name: category id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category ALTER COLUMN id SET DEFAULT nextval('public.category_id_seq'::regclass);


--
-- TOC entry 4699 (class 2604 OID 16740)
-- Name: line id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.line ALTER COLUMN id SET DEFAULT nextval('public.line_id_seq'::regclass);


--
-- TOC entry 4700 (class 2604 OID 16747)
-- Name: product id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product ALTER COLUMN id SET DEFAULT nextval('public.product_id_seq'::regclass);


--
-- TOC entry 4860 (class 0 OID 16730)
-- Dependencies: 216
-- Data for Name: category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.category (id, category, line_id) FROM stdin;
1	Cronos Old	2
2	Cronos L	2
3	Cronos-NG	2
4	Ares TB	1
5	Ares THS	1
\.


--
-- TOC entry 4862 (class 0 OID 16737)
-- Dependencies: 218
-- Data for Name: line; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.line (id, line) FROM stdin;
1	Ares
2	Cronos
\.


--
-- TOC entry 4864 (class 0 OID 16744)
-- Dependencies: 220
-- Data for Name: product; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.product (id, description, image_url, model, category_id, line_id) FROM stdin;
1	Este modelo monofásico atende as necessidades das concessionárias de energia elétrica. É um medidor compacto com dimensões compatíveis as instalações e equipamentos de calibração já existentes. Fabricado com materiais de alta tecnologia e modernas técnicas de produção, o medidor eletrônico Cronos 6001-A, é uma solução totalmente nacional para medição de elétrica, com preço extremamente competitivo.	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png	Cronos 6001‑A	1	2
2	Com a mais moderna tecnologia disponível no mercado, os medidores da linha Cronos polifásica oferecem a conhecida confiabilidade dos produtos Eletra. Uma solução efetiva de custo para aplicação em consumidores residenciais com ligações em sistemas estrela a quatro fios (medição trifásica) ou três fios (medição bifásica).	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Cronos-6003.png	Cronos 6003	1	2
3	O Cronos 7023 é um medidor eletrônico de energia ativa e reativa, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica) ou três fios (medição bifásica). Este medidor conta com um mostrador digital em LCD e foi desenvolvido com uma estrutura mecânica de alta resistência e recursos que ajudam a prevenir fraudes, reduzindo as perdas comerciais das distribuidoras de energia.	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Cronos-7023.png	Cronos 7023	1	2
4	Os medidores Cronos 6021L são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.	https://casaferreira.fbitsstatic.net/img/p/medidor-eletra-monofasico-cronos-6021l-100a-110-240v-1-elemento-2-fios-kwh-83690/270361-1.jpg?w=570&h=570&v=no-change&qs=ignore	Cronos 6021L	2	2
5	Os medidores Cronos 7023L são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-7023L.png	Cronos 7023L	2	2
6	Este modelo monofásico atende as necessidades das concessionárias de energia elétrica. É um medidor compacto com dimensões compatíveis as instalações e equipamentos de calibração já existentes. Fabricado com materiais de alta tecnologia e modernas técnicas de produção, o medidor eletrônico Cronos 6001-A, é uma solução totalmente nacional para medição de elétrica, com preço extremamente competitivo.	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png	Cronos 6001‑NG	3	2
7	Com a mais moderna tecnologia disponível no mercado, os medidores da linha Cronos polifásica oferecem a conhecida confiabilidade dos produtos Eletra. Uma solução efetiva de custo para aplicação em consumidores residenciais com ligações em sistemas estrela a quatro fios (medição trifásica) ou três fios (medição bifásica).	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Cronos-6003.png	Cronos 6003‑NG	3	2
8	Os medidores Cronos 6021-NG são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png	Cronos 6021‑NG	3	2
9	Medidor de Energia para individualização interna. Mede 110V e 220V, neutro NÃO passa no medidor, exclusivo para redes de 1 elemento	https://acdn.mitiendanube.com/stores/001/446/686/products/mono-3fios-leve11-a6f024213526240df716570053321597-1024-1024.png	Cronos 6031‑NG	3	2
10	O medidor ARES 7021-NG auxilia as concessionárias de energia a obter informações referentes ao consumo de energia de seus clientes. Projetado para operar em redes monofásicas a dois fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7021.png	Cronos 7021‑NG	3	2
11	Os medidores Cronos 7023-NG são compactos com dimensões compatíveis às instalações e equipamentos de calibração já existentes. Fabricados com materiais de alta tecnologia e modernas técnicas de produção, os medidores eletrônicos Cronos formam uma solução totalmente nacional para medição de energia ativa em consumidores residenciais.	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png	Cronos 7023‑NG	3	2
12	O medidor ARES 7021 auxilia as concessionárias de energia a obter informações referentes ao consumo de energia de seus clientes. Projetado para operar em redes monofásicas a dois fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7021.png	ARES 7021	4	1
13	O medidor Ares 7031 auxilia as concessionárias de energia a obter informações referentes ao consumo de energia elétrica de seus clientes. Projetado para operar em redes monofásicas a três fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7031.png	ARES 7031	4	1
14	O medidor Ares 7023 auxilia as concessionárias de energia a obter informações referentes ao consumo de energia elétrica de seus clientes. Projetado para operar em redes monofásicas a três ou quatro fios, registrar o consumo de energia ativa e reativa nos quatro quadrantes e atender à regulamentação normativa da ANEEL	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png	ARES 7023	4	1
15	O Ares 8023 é um medidor eletrônico Multifunção, bidirecional, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica). Ele indicado para medição de consumidores com tarifa horosazonal (THS) e clientes comerciais e industriais. BENEFÍCIOS: – Confiabilidade da medição; – Display LCD parametrizável; – Diagnóstico de instalação;	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023.png	ARES 8023 2,5	5	1
16	O Ares 8023 200 é um medidor eletrônico Multifunção, bidirecional, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica). Ele é indicado para medição de consumidores com tarifa horosazonal (THS) e clientes comerciais e industriais. BENEFÍCIOS: – Confiabilidade da medição; – Display LCD parametrizável;	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-200.png	ARES  8023 200	5	1
17	O Ares 8023 15 é um medidor eletrônico Multifunção, bidirecional, apropriado para realizar medições em sistemas estrela a quatro fios (medição trifásica). Ele é indicado para medição de consumidores com tarifa horosazonal (THS) e clientes comerciais e industriais. BENEFÍCIOS: – Confiabilidade da medição; – Display LCD parametrizável; – Diagnóstico de instalação;	https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-15.png	ARES 8023 15	5	1
\.


--
-- TOC entry 4873 (class 0 OID 0)
-- Dependencies: 215
-- Name: category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.category_id_seq', 5, true);


--
-- TOC entry 4874 (class 0 OID 0)
-- Dependencies: 217
-- Name: line_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.line_id_seq', 2, true);


--
-- TOC entry 4875 (class 0 OID 0)
-- Dependencies: 219
-- Name: product_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.product_id_seq', 17, true);


--
-- TOC entry 4702 (class 2606 OID 16735)
-- Name: category category_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);


--
-- TOC entry 4706 (class 2606 OID 16742)
-- Name: line line_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.line
    ADD CONSTRAINT line_pkey PRIMARY KEY (id);


--
-- TOC entry 4710 (class 2606 OID 16751)
-- Name: product product_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);


--
-- TOC entry 4708 (class 2606 OID 16755)
-- Name: line uk_ejgsawp2kj3fsf1v06021qs72; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.line
    ADD CONSTRAINT uk_ejgsawp2kj3fsf1v06021qs72 UNIQUE (line);


--
-- TOC entry 4712 (class 2606 OID 16757)
-- Name: product uk_l7f5cbhq679s0w0g3ig7p1a7a; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT uk_l7f5cbhq679s0w0g3ig7p1a7a UNIQUE (model);


--
-- TOC entry 4704 (class 2606 OID 16753)
-- Name: category uk_oo4xayr0g0mkbajn7n2m3918u; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT uk_oo4xayr0g0mkbajn7n2m3918u UNIQUE (category);


--
-- TOC entry 4714 (class 2606 OID 16763)
-- Name: product fk1mtsbur82frn64de7balymq9s; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT fk1mtsbur82frn64de7balymq9s FOREIGN KEY (category_id) REFERENCES public.category(id);


--
-- TOC entry 4715 (class 2606 OID 16768)
-- Name: product fk6vi98v5ok01gobegpoch0qe3y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT fk6vi98v5ok01gobegpoch0qe3y FOREIGN KEY (line_id) REFERENCES public.line(id);


--
-- TOC entry 4713 (class 2606 OID 16758)
-- Name: category fkb4sxpgm0vxae3n0calfgoyahg; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT fkb4sxpgm0vxae3n0calfgoyahg FOREIGN KEY (line_id) REFERENCES public.line(id);


-- Completed on 2024-04-15 12:59:04

--
-- PostgreSQL database dump complete
--

