// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.model;

import com.max.bookstore.model.Status;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Status_Roo_Entity {
    
    declare @type: Status: @Entity;
    
    @PersistenceContext
    transient EntityManager Status.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Status.id;
    
    @Version
    @Column(name = "version")
    private Integer Status.version;
    
    public Long Status.getId() {
        return this.id;
    }
    
    public void Status.setId(Long id) {
        this.id = id;
    }
    
    public Integer Status.getVersion() {
        return this.version;
    }
    
    public void Status.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Status.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Status.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Status attached = Status.findStatus(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Status.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Status.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Status Status.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Status merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Status.entityManager() {
        EntityManager em = new Status().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Status.countStatuses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Status o", Long.class).getSingleResult();
    }
    
    public static List<Status> Status.findAllStatuses() {
        return entityManager().createQuery("SELECT o FROM Status o", Status.class).getResultList();
    }
    
    public static Status Status.findStatus(Long id) {
        if (id == null) return null;
        return entityManager().find(Status.class, id);
    }
    
    public static List<Status> Status.findStatusEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Status o", Status.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
