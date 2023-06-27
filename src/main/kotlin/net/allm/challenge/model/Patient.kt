package net.allm.challenge.model

import jakarta.persistence.*
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails

@Table(
    name = "patients",
    indexes = [Index(columnList = "id")]
)
@Entity
data class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var name: String? = null,

    var email: String? = null,

    var pass: String? = null
) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return AuthorityUtils.createAuthorityList("USER")
    }

    override fun getPassword(): String {
        return this.pass!!
    }

    override fun getUsername(): String {
        return this.email!!
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }

}

