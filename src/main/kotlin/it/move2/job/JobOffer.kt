package it.move2.job

data class JobOffer(
    val id: String,
    val title: String,
    val companyName: String,
    val experience: String,
    val skills: List<Skill>,
    val employmentType: List<EmploymentType>,
    val remote: Boolean
)