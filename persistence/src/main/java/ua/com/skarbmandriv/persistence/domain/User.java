package ua.com.skarbmandriv.persistence.domain;

import ua.com.skarbmandriv.persistence.domain.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Viktor Kostov (vko)
 * @since 20/01/16
 */
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

}
