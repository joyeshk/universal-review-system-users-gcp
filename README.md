This is a demo project created with Java and Spring boot to demonstarte a CI/CD pipeline using following GCP services
- GCR
- GKE
- CI/CD using Cloud Build

Using the above services, following events will occur upon a successful commit to this github repo
1. Upon a commit GCP Build trigger is activated
2. It downloads all the code
3. It creates the image of the Spring boot using the dockerfile in the repo
4. It pushes the newly built image to corresponding GCR repository
5. It updates the GKE cluster so that new code gets deployed to the Kubernetes cluster
