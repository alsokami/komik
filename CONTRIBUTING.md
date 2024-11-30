# Contributing to KOMIK Mod

Thank you for your interest in contributing to the KOMIK mod for Minecraft Forge 1.20.1! This project is primarily a solo endeavor, but contributions are welcome under the following guidelines:

---

## Guidelines for Contributing

### 1. **Branch Management**
- **Do not make changes to the `main` branch.**  
  All contributions must be made to the `fix` branch. Any pull requests targeting the `main` branch will be rejected.

### 2. **Deletions**
- **No deletions without prior approval.**  
  If you need to delete any files or significant lines of code, create an issue thread first and explain the reasoning.

### 3. **Stability**
- **Do not introduce breaking changes.**  
  Any code changes must be tested to ensure they do not break existing functionality.

### 4. **Documentation**
- **Explain your changes.**  
  - If your changes introduce dependencies or rely on specific lines of code, you **must add comments** explaining the purpose and functionality of those dependencies.
  - Clear, concise, and helpful comments are required to maintain code clarity.

---

## Contribution Process

1. **Fork the repository.**  
   Make a copy of the project in your GitHub account.

2. **Clone your fork.**  
   Clone the repository to your local machine and set up the environment.

3. **Create a new branch.**  
   Always branch off the `fix` branch for your contributions:
   ```bash
   git checkout -b your-feature-branch fix
