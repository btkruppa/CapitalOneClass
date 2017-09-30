package com.cpitalone.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capitalone.beans.User;

public class UserSerializerUtility {
	public void serializeUser(User obj) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(obj.getUsername() + ".txt"))) {
			os.writeObject(obj);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User deserializeUser(String username) {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(username + ".txt"))) {
			return (User) is.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}
}
