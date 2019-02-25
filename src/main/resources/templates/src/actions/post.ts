import axios from 'axios'
import {PostStore} from '../store/PostStore'

export const loadPost: (store: PostStore) => void = (store: PostStore) => {
  axios.get('/api/posts')
        .then(resp => resp.data)
        .then((posts: any[]) => store.setPosts(posts))
}
