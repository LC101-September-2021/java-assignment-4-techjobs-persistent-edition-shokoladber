-- Part 1: Test it with SQL
    SELECT * FROM techjobs.job;
    id int PK
    employer varchar(255)
    name varchar(255)
    skills varchar(255)

-- Part 2: Test it with SQL
    SELECT * FROM techjobs.employer
    WHERE location="St. Louis";

-- Part 3: Test it with SQL
    DROP TABLE techjobs.job;

-- Part 4: Test it with SQL

    SELECT name, description
    FROM techjobs.skill
    INNER JOIN techjobs.job_skills
    ON techjobs.skill.id = techjobs.job_skills.skills_id
    WHERE (techjobs.job_skills.jobs_id IS NOT NULL)
    ORDER BY name ASC;