import {Post} from './Interfaces'
import NULL = Post.NULL;

declare type ChangeCallback = (store: PostStore) => void

export class PostStore {

  private static store: PostStore
  public post: Post = NULL
  public posts: ReadonlyArray<Post> = []
  private callbacks: ChangeCallback[] = []

  private constructor () { }

  public static getInstance (): PostStore {
    if (!this.store) {
      this.store = new PostStore()
    }
    return this.store
  }

  onChange (cb: ChangeCallback) {
    this.callbacks.push(cb)
  }

  inform () {
    this.callbacks.forEach(cb => cb(this))
  }

  setPost (post: Post): void {
    this.post = post
    this.inform()
  }

  setPosts (posts: ReadonlyArray<Post>): void {
    this.posts = posts
    this.inform()
  }

}
