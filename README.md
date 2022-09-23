[![Gradle CI/CD](https://github.com/hoho4190/aws-ec2-cicd-with-github-actions/actions/workflows/gradle-push-cicd.yml/badge.svg)](https://github.com/hoho4190/aws-ec2-cicd-with-github-actions/actions/workflows/gradle-push-cicd.yml)

# AWS EC2 CI/CD

AWS와 GitHub Actions을 이용하여 AWS EC2에 CI/CD 적용하기

GitHub 저장소에 소스를 Push하면 test, build 후 클라우드 서버에 배포하고 서비스 재시작하기

## 흐름

GitHub 저장소의 `main` 브런치에 Push가 발생하면 GitHub Actions에서 아래의 워크플로우가 실행됨

1. gradle build 실행

2. AWS IAM 사용자 엑세스 키로 AWS 인증

3. AWS S3에 파일을 압축하여 업로드

4. AWS CodeDeploy로 S3의 파일을 EC2에 배포
	- hook을 이용하여 App 재시작 스크립트 실행

## [Wiki](https://github.com/hoho4190/aws-ec2-cicd-with-github-actions/wiki)
