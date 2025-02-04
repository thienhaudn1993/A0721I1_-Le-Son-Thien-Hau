package com.codegym.blogajax.service.Impl;

import com.codegym.blogajax.dto.BlogDTO;
import com.codegym.blogajax.model.Blog;
import com.codegym.blogajax.model.Category;
import com.codegym.blogajax.repository.IBlogRepository;
import com.codegym.blogajax.repository.ICategoryRepository;
import com.codegym.blogajax.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findBlogById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBlogDTO(BlogDTO blogDTO) {
        Blog blog = new Blog();
        blog.setNameBlog(blogDTO.getNameBlog());
        blog.setContent(blogDTO.getContent());
        blog.setDate(blogDTO.getDate());
        Category category = categoryRepository.findById(Long.valueOf(blogDTO.getCategory())).orElse(null);
        blog.setCategory(category);
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> searchByNameBlog(String name) {
        return blogRepository.searchByNameBlog(name);
    }

}
