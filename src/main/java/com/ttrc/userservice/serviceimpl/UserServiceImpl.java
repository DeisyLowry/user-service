package com.ttrc.userservice.serviceimpl;

import com.ttrc.userservice.dto.UserDto;
import com.ttrc.userservice.dto.UserRequestDto;
import com.ttrc.userservice.dto.UserResponseDto;
import com.ttrc.userservice.entity.User;
import com.ttrc.userservice.exception.EmailAlreadyExistsException;
import com.ttrc.userservice.exception.ResourceNotFoundException;
import com.ttrc.userservice.mapper.AutoUserMapper;
import com.ttrc.userservice.repository.UserRepository;
import com.ttrc.userservice.service.UserService;
import jakarta.persistence.Column;
import jakarta.persistence.ExcludeSuperclassListeners;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.ttrc.userservice.mapper.UserMapper.mapToUser;
import static com.ttrc.userservice.mapper.UserMapper.mapToUserDto;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Slf4j

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    //private ModelMapper modelMapper;

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
    @Override
    public User getUserById(Integer id){
            User retUser = userRepository.getUserById(id);
            return retUser;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = mapToUser(userDto);
        User saveUser = userRepository.save(user);
        UserDto retUserDto =  mapToUserDto(saveUser);
        log.info("User with this id {} has been added to the system ", user.getId() );
        return retUserDto;
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
        log.info("User with this id {} has been removed from the system ", userId );
    }

/*
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getUserId(),
                userDto.getUserEmail(),
                userDto.getPassword(),
                userDto.getNotes(),
                userDto.getIsActive(),
                userDto.getIsAdmin()
        );
        User saveUser = userRepository.save(user);

        UserDto savedUserDto = new UserDto(
                saveUser.getId(),
                saveUser.getFirstName(),
                saveUser.getLastName(),
                saveUser.getUserId(),
                saveUser.getUserEmail(),
                saveUser.getPassword(),
                saveUser.getNotes(),
                saveUser.getIsActive(),
                saveUser.getIsAdmin()
        );
        return savedUserDto;
    }


public User -
    @Override
    public UserDto getUserById(String userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", userId)
        );

        return AutoUserMapper.MAPPER.mapToUserDto(user);
    }
    @Override
    public UserDto createUser(UserDto userDto) {

        // Test if User in the system
        Optional<User> optionalUser = userRepository.findByEmail(userDto.getUserEmail());

        // If user there throw custom exception message
        if(optionalUser.isPresent()){
            throw new EmailAlreadyExistsException("Email Already Exists for User");
        }

        // if not then map the userDto to a User object to insert into the database
        User user = AutoUserMapper.MAPPER.mapToUser(userDto);

        //return savedUserDto;
        return AutoUserMapper.MAPPER.mapToUserDto(userRepository.save(user));
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();

        // Stream the users to a map and return the list of userDTO
        return users.stream().map((user) -> AutoUserMapper.MAPPER.mapToUserDto(user))
            .collect(Collectors.toList());
    }


    @Override
    public UserDto updateUser(UserDto user) {

        User existingUser = userRepository.findById(user.getId()).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", user.getUserId())
        );

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setUserEmail(user.getUserEmail());

        return AutoUserMapper.MAPPER.mapToUserDto(userRepository.save(existingUser));
    }

    @Override
    public void deleteUser(Long userId) {

    }
*/
}
