# 🧠 spring_ai_with_local_llm

게임 아이템 거래 플랫폼에서 사용할 수 있는 AI 기반 챗봇 서비스  
Spring Boot 3.5, Spring AI, WebFlux, Ollama 기반의 로컬 LLM을 사용하여 유저의 자연어 질의에 따라 적절한 게임 아이템을 추천해줍니다.

---

## ✅ 주요 기능

- 🔍 자연어 기반 게임 아이템 질의 응답
- 🧠 로컬 LLM(Ollama) + 벡터 검색(Qdrant or Elasticsearch) 기반 RAG 구조
- ⚡ Spring WebFlux 기반 비동기 API
- 🖼️ 이미지 업로드 및 분석 (옵션)

---

## 🛠️ 기술 스택

| 기술 | 설명 |
|------|------|
| Spring Boot 3.5 | 애플리케이션 프레임워크 |
| Spring AI | LLM 및 Vector Store 연동 |
| WebFlux | 비동기 웹 API 처리 |
| Ollama | 로컬 LLM 실행환경 (예: Mistral, LLaVA 등) |
| Qdrant (선택) | 벡터 검색을 위한 Vector DB |
| Elasticsearch (선택) | 검색 기반 상품 추천 |
| PostgreSQL (선택) | 상품 메타데이터 저장 |

---

## ⚙️ 설정 방법

### 1. 로컬 LLM (Ollama) 실행

```bash
ollama run mistral
# 또는 이미지 분석이 필요한 경우
ollama run llava
