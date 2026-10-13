### Step 1: Setting Up the Repository and Adding Files

To start version control on a project, we first create a project folder on our computer and initialize Git inside it.

**Terminal commands used:**
```bash
mkdir web-portfolio
cd web-portfolio
git init
```

**Expected terminal output:**
```text
Initialized empty Git repository in C:/Users/Student/Documents/web-portfolio/.git/
```

**Creating two project files:**
Next, we add at least two files into the project folder so that Git has code to monitor:

```bash
echo "<h1>Welcome to My Portfolio</h1>" > index.html
echo "body { background-color: #f4f4f4; }" > style.css
```

**Explanation:**  
Running `git init` turns the ordinary folder into a tracked Git repository. At this stage, both `index.html` and `style.css` exist in our local workspace, but Git is not actively tracking or storing versions of them yet.

---

### Step 2: Checking Status and Staging Files (`git status` and `git add`)

Before saving any changes permanently, we check the state of the repository and move our files into the staging area.

#### 1. Checking the file status
```bash
git status
```

**Expected terminal output:**
```text
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html
        style.css

nothing added to commit but untracked files present (use "git add" to track)
```

**Explanation:**  
The `git status` command reports the current condition of the repository. Git flags both files as **untracked** (often shown in green or with a `U` symbol in code editors) because it recognizes that new files exist, but it has not been told to include them in a commit snapshot.

#### 2. Staging the files
To prepare our files for saving, we add them to the staging area:

```bash
git add index.html style.css
```
*(Shortcut note: Typing `git add .` using a single period will stage all untracked and modified files across the directory at once.)*

#### 3. Confirming the staged state
Running `git status` once more confirms that our files are ready to be saved:

```text
Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   index.html
        new file:   style.css
```

**A helpful mental picture:**  
Think of the staging area like a packing box before shipping a parcel. Running `git add` places the selected items neatly inside the open box so you can review everything before sealing the package.

---

### Step 3: Creating Multiple Commits with Meaningful Messages (`git commit`)

A **commit** acts as a permanent milestone snapshot in your project timeline. Every commit requires a clear, descriptive message explaining the purpose of the update.

#### Commit 1: Initial project setup
We seal our first official snapshot using the inline message flag `-m`:

```bash
git commit -m "Initial commit: create index.html and style.css"
```

**Expected terminal output:**
```text
[main (root-commit) 3d2f9a1] Initial commit: create index.html and style.css
 2 files changed, 2 insertions(+)
 create mode 100644 index.html
 create mode 100644 style.css
```

After this command executes, Git confirms that the working tree is clean and all files are safely recorded.

#### Commit 2: Updating an existing file
To satisfy the requirement of creating multiple commits, we modify `index.html` to add a new section, stage the change, and save a second milestone:

```bash
echo "<p>About Me: Student Web Developer</p>" >> index.html
git add index.html
git commit -m "Add about me paragraph to index.html"
```

**Expected terminal output:**
```text
[main 7c8e21b] Add about me paragraph to index.html
 1 file changed, 1 insertion(+)
```

**Why meaningful commit messages matter:**  
Writing detailed, purposeful commit messages creates a clear history trail. If a teammate, teacher, or future employer inspects the project on GitHub, they can immediately understand what each change achieved without having to read through all the raw code lines.

---

### Step 4: Viewing the Commit History (`git log`)

Git provides the `git log` command so we can inspect the chronological timeline of all recorded snapshots.

#### 1. Full history log
```bash
git log
```

**Expected terminal output:**
```text
commit 7c8e21b4f2a9381e05d4b8e21c3d9a1f23456789 (HEAD -> main)
Author: Student Developer <student@example.com>
Date:   Mon Oct 13 10:15:30 2026 +0000

    Add about me paragraph to index.html

commit 3d2f9a1b6c7e8d9a0f1e2d3c4b5a678901234567
Author: Student Developer <student@example.com>
Date:   Mon Oct 13 10:10:15 2026 +0000

    Initial commit: create index.html and style.css
```

#### 2. Compact single-line view
To view a quick summary of recent project milestones, we run the `--oneline` shortcut:

```bash
git log --oneline
```

**Expected terminal output:**
```text
7c8e21b (HEAD -> main) Add about me paragraph to index.html
3d2f9a1 Initial commit: create index.html and style.css
```

**What this information shows:**  
* **Commit hash:** A unique identifier string that marks that exact snapshot in history.
* **Author information:** The name and email configured in global user settings.
* **Timestamp:** The exact date and time the commit was recorded.
* **Commit message:** The descriptive summary explaining what was modified.

---

### Step 5: Two Common Beginner Mistakes and How to Avoid Them

#### Mistake 1: Omitting the `-m` flag when running `git commit`
* **What happens:** New learners often type `git commit` and hit Enter without adding `-m "Your message"`. Git immediately halts and opens a default text editor inside the terminal, displaying the prompt: `hint: Waiting for your editor to close the file...`. The terminal appears frozen to a beginner, and standard keyboard typing stops working.
* **Why it happens:** Git requires a descriptive message for every single commit snapshot and will wait for an editor file to be written, saved, and closed before finishing the save.
* **How to fix or avoid it:** Always include the inline flag directly in your terminal command: `git commit -m "Your clear message"`. If you accidentally trigger the terminal editor, type your message, save the file, and close the editor tab to let Git finalize the commit.

#### Mistake 2: Attempting to commit modified files without staging them first
* **What happens:** A beginner makes edits to an existing file, saves it in their code editor, and immediately runs `git commit -m "Updated code"` without staging. Git prints an error: `no changes added to commit (use "git add" to track)`. Students often assume Git failed or deleted their edits.
* **Why it happens:** Saving a file on your computer only updates your **Working Directory**; it does not move the file into the **Staging Area**. Git intentionally separates these steps so developers can choose precisely which modified files to include in a given commit.
* **How to fix or avoid it:** Always check your workspace status with `git status` first, stage your modified files using `git add <file>`, and then commit. Alternatively, for existing tracked files, you can use the combined shortcut `git commit -am "Your message"` to stage and commit in one step.

---

### Step 6: Evaluation Criteria Summary Checklist

| Evaluation Criterion | Requirement Fulfilled | Primary Command(s) | Practical Result |
| :--- | :--- | :--- | :--- |
| **1. Correct Command Usage** | Used status inspection, staged files, and recorded snapshots | `git status`, `git add`, `git commit` | Correctly moved files from untracked to staged and committed states |
| **2. Meaningful Messages** | Documented specific, clear reasons for each save | `-m "..."` flag | Provided descriptive context for project milestones |
| **3. Multiple Commits Created** | Recorded at least two distinct snapshots | `git commit` (executed twice) | Successfully created both initial and update commits |
| **4. History Viewed Correctly** | Inspected the commit timeline and metadata | `git log`, `git log --oneline` | Verified author, date, hash, and commit messages |
| **5. Beginner Mistakes Explained** | Analyzed two real pitfalls with practical solutions | — | Explained the text editor freeze from missing `-m` and the unstaged commit error |

---
