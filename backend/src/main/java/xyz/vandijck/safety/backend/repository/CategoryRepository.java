package xyz.vandijck.safety.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.vandijck.safety.backend.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
}
