# 🚀 Jenkins Shared Libraries

Welcome to the **Jenkins Shared Libraries** repository – a powerful collection of reusable and modular Groovy scripts built to **standardize**, **simplify**, and **accelerate** CI/CD pipelines using Jenkins.

This project encapsulates common pipeline operations like Git interactions, logging, and utility functions—empowering teams to eliminate duplication and adopt best practices across pipelines.

---

## 📦 Features

- 🧩 **Reusable pipeline steps** like `gitPush()` and `sayHello()`
- 🧠 **Modular utilities** with clean, testable Groovy classes
- 🛠️ Easy integration with both **declarative** and **scripted** pipelines
- 🔐 Secure credential handling
- 🌱 Scalable and extendable for growing Jenkins projects

---

## 🧱 Repository Structure

```
jenkins-shared-libraries/
├── vars/
    ├── clone.groovy         
    ├── docker_build.groovy   
    ├── docker_compose.groovy       
    ├── docker_push.groovy  
    └── hello.groovy       
---

## ⚙️ Setup Instructions

### 🔗 Add the Library to Jenkins

1. Navigate to: **Manage Jenkins → Configure System → Global Pipeline Libraries**
2. Click **Add** and fill in:
   - **Name**: `jenkins-shared-libraries` (or any alias)
   - **Default version**: `main`
   - **Retrieval method**: *Modern SCM* → **Git**
   - **Project Repository**:  
     `https://github.com/M-Tayyab06/jenkins-shared-libraries.git`
3. *(Optional)* Enable `Load implicitly` to auto-load the library in all pipelines.

---

## 🚀 Usage Example

### ✅ Declarative Pipeline (Jenkinsfile)

```groovy
@Library('jenkins-shared-libraries') _

pipeline {
    agent any

    stages {
        stage('Demo') {
            steps {
                sayHello 'World'
                gitPush repo: 'https://github.com/example/repo.git', credentialsId: 'git-credentials'
            }
        }
    }
}
```


## 🧪 Testing Locally

You can clone and test this library before pushing changes:

```bash
git clone https://github.com/M-Tayyab06/jenkins-shared-libraries.git
cd jenkins-shared-libraries

# Make changes to vars/ 
# Push to your branch and reference the branch in Jenkins configuration
```

## 🤝 Contributing

We welcome contributions! Here's how to get started:

1. 🍴 Fork the repo
2. 🌿 Create a feature branch: `git checkout -b feature-name`
3. ✍️ Add or improve Groovy files in `vars/` 
4. ✅ Test your changes in Jenkins
5. 📩 Submit a pull request with a clear description

---

## 📬 Contact

For issues, suggestions, or questions:
- Open an [Issue](https://github.com/M-Tayyab06/jenkins-shared-libraries/issues)
- Reach out on GitHub: [@M-Tayyab06](https://github.com/M-Tayyab06)

---

> ✨ _“Automate the repeatable. Simplify the complex. Share the powerful.”_  
> — Jenkins Shared Libraries Philosophy
