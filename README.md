# SIT333 9.1P TDD and CI - Failure Version

This Maven project is intentionally made for the TDD red step.

The method `getInboxForStudent()` in `OnTrackInboxService.java` is not completed yet.
It returns an empty list, so the JUnit test will fail.

## How to use

1. Import this project into Eclipse as an Existing Maven Project.
2. Open `OnTrackInboxServiceTest.java`.
3. Run it as JUnit Test.
4. Take screenshot of the red failing JUnit result.
5. Push this version to GitHub to get a failed CI build.
6. Take screenshot of failed GitHub Actions and failed email notification.
7. Then fix the method and push again for the green/success step.
