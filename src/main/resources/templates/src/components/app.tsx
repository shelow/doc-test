import * as React from 'react'
import {PostsWrapper} from './posts-wrapper'
import {Header} from './header'
import {PostStore} from '../store/PostStore'
import axios from 'axios'
import {Post} from '../store/Interfaces'

interface Props {
}

interface State {
  posts: ReadonlyArray<Post>,
  setPosts: (posts: ReadonlyArray<Post>) => void
}

export class App extends React.Component<Props, State> {

  private store: PostStore = PostStore.getInstance()

  constructor (props: any) {
    super(props)
    this.state = {
      posts: this.store.posts,
      setPosts: this.store.setPosts.bind(this.store)
    }

    this.store.onChange((store) => {
      console.log('on change -> ' + store.posts)
      this.setState({ posts: store.posts })
    })
  }

  render () {
    console.log('reload app')
    return <div>
            <Header />
            <PostsWrapper posts={this.state.posts}/>
        </div>
  }

  componentDidMount (): void {
    axios.get('/api/posts/')
          .then(resp => resp.data)
          .then((posts: any[]) => this.state.setPosts(posts))
  }
}
